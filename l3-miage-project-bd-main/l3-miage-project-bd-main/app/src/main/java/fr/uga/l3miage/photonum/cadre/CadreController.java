package fr.uga.l3miage.photonum.cadre;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



import fr.uga.l3miage.photonum.service.CadreService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CadreController {
    private final CadreService cadreService;
    private final CadreMapper cadreMapper;

    public CadreController( CadreService cadreService,
            CadreMapper cadreMapper) {

        this.cadreService = cadreService;
        this.cadreMapper = cadreMapper;
    }

    // creation d'une impression de type cadre
    @PostMapping(value = "/clients/{id}/cadres", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CadreDTO newImpression(@PathVariable("id") @NotNull Long idClient, @RequestBody @Valid CadreDTO impression)  {
        try {
            final var entity = cadreService.save(idClient, cadreMapper.dtoToEntity(impression));
            return cadreMapper.entityToDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
    }
}

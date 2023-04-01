package fr.uga.l3miage.photonum.tirage;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import fr.uga.l3miage.photonum.service.TirageService;
import fr.uga.l3miage.photonum.tirage.TirageMapper;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class TirageController {
    private final TirageService tirageService;
    private final TirageMapper tirageMapper;

    public TirageController(TirageService tirageService, TirageMapper tirageMapper){
        this.tirageService = tirageService;
        this.tirageMapper = tirageMapper;
    }

    // creation d'une impression de type tirage
    @PostMapping(value = "/clients/{id}/tirages", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public TirageDTO newTirage(@PathVariable("id") @NotNull Long idClient, @RequestBody @Valid TirageDTO impression) {
        try {
            final var entity = tirageService.save(idClient, tirageMapper.dtoToEntity(impression));
            return tirageMapper.entityToDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
    }

}

package fr.uga.l3miage.photonum.album;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



import fr.uga.l3miage.photonum.service.AlbumService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class AlbumController {
    private final AlbumService albumService;
    private final AlbumMapper albumMapper;

    public AlbumController( AlbumService albumService, AlbumMapper albumMapper) {

        this.albumService = albumService;
        this.albumMapper = albumMapper;
    }

    // creation d'une impression de type album
    @PostMapping(value = "/clients/{id}/albums", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public AlbumDTO newAlbum(@PathVariable("id") @NotNull Long idClient, @RequestBody @Valid AlbumDTO impression) {
        try {
            final var entity = albumService.save(idClient, albumMapper.dtoToEntity(impression));
            return albumMapper.entityToDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
    }
}

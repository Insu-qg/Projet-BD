package fr.uga.l3miage.photonum.photo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.service.DeleteException;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import fr.uga.l3miage.photonum.service.PhotoService;
import fr.uga.l3miage.photonum.service.TirageService;
import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.data.domain.Tirage;
import fr.uga.l3miage.photonum.photo.PhotoDTO;
import fr.uga.l3miage.photonum.photo.PhotoMapper;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class PhotoController {

    private final PhotoService photoService;
    private final PhotoMapper photoMapper;
    private final TirageService tirageService;

    public PhotoController(PhotoService photoService, PhotoMapper photoMapper, TirageService tirageService) {
        this.photoService = photoService;
        this.photoMapper = photoMapper;
        this.tirageService = tirageService;
    }
    
    // récupération de toutes les photosd d'un client
    @GetMapping(value = "/clients/{id}/photos")
    public Collection<PhotoDTO> photos(@PathVariable("id") @NotNull Long idClient) {
        try {
            return photoService.getByClientId(idClient)
                    .stream()
                    .map(photoMapper::entityToDTO)
                    .toList();
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        }
    }

    // création d'une nouvelle photo
    @PostMapping(value = "/clients/{id}/photos", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public PhotoDTO newPhoto(@PathVariable("id") @NotNull Long idClient, @RequestBody @Valid PhotoDTO photoDTO) throws EntityNotFoundException {
        try {
            final var photoEntity = photoMapper.dtoToEntity(photoDTO);
            final var savedPhoto = photoService.save(idClient, photoEntity);
            return photoMapper.entityToDTO(savedPhoto);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
    }

    // mise à jour d'une photo existante
    @PutMapping(value = "/clients/{id}/photos/{idPhoto}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PhotoDTO updatePhoto(@PathVariable("id") @NotNull Long idClient, @PathVariable("idPhoto") @NotNull Long idPhoto, @RequestBody @Valid PhotoDTO photoDTO) {
        try {
            final var photoEntity = photoMapper.dtoToEntity(photoDTO);
            final var updatedPhoto = photoService.update(photoEntity);
            return photoMapper.entityToDTO(updatedPhoto);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        }
    }

    // suppression d'une photo existante
    @DeleteMapping(value = "/clients/{id}/photos/{idPhoto}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePhoto(@PathVariable("id") @NotNull Long idClient, @PathVariable("idPhoto") @NotNull Long idPhoto) {
        try {
            Photo photoToDelete = photoService.get(idPhoto);
            Collection<Tirage> tiragesWithPhoto = tirageService.getTiragesByPhoto(photoToDelete);
            if (!tiragesWithPhoto.isEmpty()) {
                throw new DeleteException("La photo est utilisée dans au moins un tirage.");
            }
            photoService.delete(photoToDelete.getIdPhoto());
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La photo demandée n'existe pas.", e);
        } catch (DeleteException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
    }
}

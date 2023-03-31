package fr.uga.l3miage.photonum.impression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.cadre.CadreDTO;
import fr.uga.l3miage.photonum.cadre.CadreMapper;
import fr.uga.l3miage.photonum.calendrier.CalendrierDTO;
import fr.uga.l3miage.photonum.calendrier.CalendrierMapper;
import fr.uga.l3miage.photonum.service.AlbumService;
import fr.uga.l3miage.photonum.service.CadreService;
import fr.uga.l3miage.photonum.service.CalendrierService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import fr.uga.l3miage.photonum.service.ImpressionService;
import fr.uga.l3miage.photonum.service.TirageService;
import fr.uga.l3miage.photonum.tirage.TirageDTO;
import fr.uga.l3miage.photonum.tirage.TirageMapper;
import fr.uga.l3miage.photonum.album.AlbumDTO;
import fr.uga.l3miage.photonum.album.AlbumMapper;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImpressionController {

    private final TirageService tirageService;
    private final TirageMapper tirageMapper;
    private final AlbumService albumService;
    private final AlbumMapper albumMapper;
    private final CalendrierService calendrierService;
    private final CalendrierMapper calendrierMapper;
    private final CadreService cadreService;
    private final CadreMapper cadreMapper;
    @Autowired
    public ImpressionController(TirageService tirageService, TirageMapper tirageMapper, AlbumService albumService,
            AlbumMapper albumMapper, CalendrierService calendrierService, CalendrierMapper calendrierMapper,
            CadreService cadreService, CadreMapper cadreMapper, ImpressionService impressionService,ImpressionMapper impressionMapper) {
        this.tirageService = tirageService;
        this.albumService = albumService;
        this.calendrierService = calendrierService;
        this.cadreService = cadreService;
        this.tirageMapper = tirageMapper;
        this.albumMapper = albumMapper;
        this.calendrierMapper = calendrierMapper;
        this.cadreMapper = cadreMapper;
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

    // creation d'une impression de type calendrier
    @PostMapping(value = "/clients/{id}/calendriers", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CalendrierDTO newImpression(@PathVariable("id") @NotNull Long idClient, @RequestBody @Valid CalendrierDTO impression) {
        try {
            final var entity = calendrierService.save(idClient, calendrierMapper.dtoToEntity(impression));
            return calendrierMapper.entityToDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }
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
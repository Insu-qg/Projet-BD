package fr.uga.l3miage.photonum.impression;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.cadre.CadreDTO;
import fr.uga.l3miage.photonum.cadre.CadreMapper;
import fr.uga.l3miage.photonum.calendrier.CalendrierDTO;
import fr.uga.l3miage.photonum.calendrier.CalendrierMapper;
import fr.uga.l3miage.photonum.data.domain.Impression;
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
    public ImpressionController(TirageService tirageService, TirageMapper tirageMapper,AlbumService albumService, AlbumMapper albumMapper, CalendrierService calendrierService, CalendrierMapper calendrierMapper,CadreService cadreService,CadreMapper cadreMapper) {
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
    public TirageDTO newTirage(@RequestBody @Valid TirageDTO impression) {
        var saved = tirageService.save(tirageMapper.dtoToEntity(impression));
        return tirageMapper.entityToDTO(saved);
    }

    // creation d'une impression de type album
    @PostMapping(value = "/clients/{id}/albums", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public AlbumDTO newAlbum(@RequestBody @Valid AlbumDTO impression) {
        var saved = albumService.save(albumMapper.dtoToEntity(impression));
        return albumMapper.entityToDTO(saved);
    }

    // creation d'une impression de type calendrier
    @PostMapping(value = "/clients/{id}/calendriers", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CalendrierDTO newCalendrier(@RequestBody @Valid CalendrierDTO impression) {
        var saved = calendrierService.save(calendrierMapper.dtoToEntity(impression));
        return calendrierMapper.entityToDTO(saved);
    }

    // creation d'une impression de type cadre
    @PostMapping(value = "/clients/{id}/cadres", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public CadreDTO newCadre(@RequestBody @Valid CadreDTO cadre) {
        var saved = cadreService.save(cadreMapper.dtoToEntity(cadre));
        return cadreMapper.entityToDTO(saved);
    }
    
    /*//recuperation d'une impression de type tirage 
    @GetMapping(value = "/tirages/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public TirageDTO tirage(@PathVariable("id") @NotNull Long id) {
        try {
            return tirageMapper.entityToDTO(tirageService.get(id));
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        }
    }
    //recuperation d'une impression de type album
    @PostMapping(value = "/clients/{id}/albums", consumes = MediaType.APPLICATION_JSON_VALUE)

    public ImpressionDTO newAlbum(@PathVariable("id") @NotNull Long id) {
        var saved = albumService.save(albumMapper.dtoToEntity(impression));
        return albumMapper.entityToDTO(saved);
    }
    //recuperation d'une impression de type calendrier
    @PostMapping(value = "/clients/{id}/calendriers", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ImpressionDTO newImpression(@RequestBody @Valid ImpressionDTO impression) {
        var saved = calendrierService.save(calendrierMapper.dtoToEntity(impression));
        return calendrierMapper.entityToDTO(saved);
    }

    //recuperation d'une impression de type cadre
    @PostMapping(value = "cadres", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ImpressionDTO newImpression(@RequestBody @Valid CadreDTO cadre) {
        var saved = cadreService.save(cadreMapper.dtoToEntity(cadre));
        return cadreMapper.entityToDTO(saved);
    }*/
}

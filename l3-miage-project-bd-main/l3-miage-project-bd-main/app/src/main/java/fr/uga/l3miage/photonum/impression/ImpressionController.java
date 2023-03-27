package fr.uga.l3miage.photonum.impression;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.l3miage.photonum.cadre.CadreDTO;
import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.service.ImpressionService;
import fr.uga.l3miage.photonum.service.TirageService;
import fr.uga.l3miage.photonum.tirage.TirageDTO;
import fr.uga.l3miage.photonum.tirage.TirageMapper;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImpressionController {

    private final TirageService tirageService;
    private final TirageMapper tirageMapper;
    private final AlbumService albumService;
    private final AlbumMapper AlbumMapper;
    private final CalendrierService calendrierService;
    private final CalendrierMapper calendrierMapper;
    private final CadreService cadreService;
    private final CadreMapper cadreMapper;


    @Autowired
    public ImpressionController(TirageService tirageService, TirageMapper tirageMapper,AlbumService albumService, AlbumMapper AlbumMapper, CalendrierService calendrierService, CalendrierMapper calendrierMapper,CadreService cadreService,CadreMapper cadreMapper) {
        this.tirageService = tirageService;
        this.albumService = albumService;
        this.calendrierService = calendrierService;
        this.cadreService = cadreService;
        this.tirageMapper = tirageMapper;
        this.albumMapper = albumMapper;
        this.calendrierMapper = calendrierService;
        this.cadreMapper = cadreMapper;
    }
    //creation d'une impression de type tirage 
    @PostMapping(value = "/clients/{id}/tirages", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public TirageDTO newTirage(@RequestBody @Valid TirageDTO impression) {
        var saved = tirageService.save(tirageMapper.dtoToEntity(impression));
        return tirageMapper.entityToDTO(saved);
    }
    //creation d'une impression de type album
    @PostMapping(value = "/clients/{id}/albums", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ImpressionDTO newAlbum(@RequestBody @Valid ImpressionDTO impression) {
        var saved = albumService.save(albumMapper.dtoToEntity(impression));
        return albumMapper.entityToDTO(saved);
    }
    //creation d'une impression de type calendrier
    @PostMapping(value = "/clients/{id}/calendriers", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ImpressionDTO newImpression(@RequestBody @Valid ImpressionDTO impression) {
        var saved = calendrierService.save(calendrierMapper.dtoToEntity(impression));
        return calendrierMapper.entityToDTO(saved);
    }

    //creation d'une impression de type cadre
    @PostMapping(value = "/clients/{id}/cadres", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ImpressionDTO newImpression(@RequestBody @Valid CadreDTO cadre) {
        var saved = cadreService.save(cadreMapper.dtoToEntity(cadre));
        return cadreMapper.entityToDTO(saved);
    }
}

package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.album.AlbumMapper;
import fr.uga.l3miage.photonum.cadre.CadreMapper;
import fr.uga.l3miage.photonum.calendrier.CalendrierMapper;
import fr.uga.l3miage.photonum.tirage.TirageMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ClientController {

    private ClientMapper clientMapper;
    private TirageMapper tirageMapper;
    private AlbumMapper albumMapper;
    private CadreMapper cadreMapper;
    private CalendrierMapper calendrierMapper;
}

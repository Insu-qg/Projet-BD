package fr.uga.l3miage.photonum.calendrier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.l3miage.photonum.service.CalendrierService;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CalendrierController {
    private final CalendrierService calendrierService;
    private final CalendrierMapper calendrierMapper;

    public CalendrierController(CalendrierService calendrierService, CalendrierMapper calendrierMapper){
        this.calendrierService = calendrierService;
        this.calendrierMapper = calendrierMapper;
    }
}

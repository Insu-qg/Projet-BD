package fr.uga.l3miage.photonum.impression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.calendrier.CalendrierDTO;
import fr.uga.l3miage.photonum.calendrier.CalendrierMapper;
import fr.uga.l3miage.photonum.service.CalendrierService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImpressionController {

    
    
    private final CalendrierService calendrierService;
    private final CalendrierMapper calendrierMapper;
    
    @Autowired
    public ImpressionController(  CalendrierService calendrierService, CalendrierMapper calendrierMapper
            ) {
        
        
        this.calendrierService = calendrierService;
        
        
        this.calendrierMapper = calendrierMapper;
        
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

    

    
 

}
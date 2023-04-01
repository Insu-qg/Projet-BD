package fr.uga.l3miage.photonum.commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.data.domain.Etat;
import fr.uga.l3miage.photonum.service.CommandeService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class CommandeController {
    
    private final CommandeService commandeService;
    private final CommandeMapper commandesMapper;
   
    @Autowired
    public CommandeController(CommandeService commandeService, CommandeMapper commandesMapper){
        this.commandeService = commandeService;
        this.commandesMapper = commandesMapper;
    }

    @PutMapping("/clients/{id}/commandes")
    @ResponseStatus(HttpStatus.CREATED)
    public CommandeDTO newCommande(@PathVariable("id") @NotNull Long id, @RequestBody @Valid CommandeDTO commande) throws EntityNotFoundException{
        
        try {
            Commande entity = commandeService.save(id, commandesMapper.dtoToEntity(commande));
            return commandesMapper.entityToDTO(entity);
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, null, e);
        }

    }

    @GetMapping("/clients/{id}/commandes/{id}")
    public CommandeDTO getCommande(@PathVariable("id") @NotNull Long id) {
        try {
            return commandesMapper.entityToDTO(commandeService.get(id));
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        }
    }
    

    @PutMapping("/clients/{id}/commandes/{id}")
    public CommandeDTO valideCommande(@NotNull @PathVariable("id") Long idCommande, @RequestBody @Valid CommandeDTO commande){
        Commande commandedeux = commandesMapper.dtoToEntity(commande);

        try{
            if(commandedeux.getIdCommande().equals(idCommande) && (commandedeux.getStatus()==Etat.LIVRE || commandedeux.getStatus()==Etat.ENCOURS) ){
                var update = commandeService.update(commandesMapper.dtoToEntity(commande));
                return commandesMapper.entityToDTO(update);
            } 
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } catch (EntityNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, null, e);
        } 
    }
}

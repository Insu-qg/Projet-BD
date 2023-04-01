package fr.uga.l3miage.photonum.adresse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.service.AdresseService;
import fr.uga.l3miage.photonum.service.ClientService;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class AdresseController {

    private final AdresseService adresseService;
    private final AdresseMapper adresseMapper;
    private final ClientService clientService;

    public AdresseController(AdresseService adresseService, AdresseMapper adresseMapper,ClientService clientService) {
        this.adresseService = adresseService;
        this.adresseMapper = adresseMapper;
        this.clientService=clientService;
    }

    // récupération d'une adresse par son id
    @GetMapping("/adresses/{id}")
    public AdresseDTO address(@PathVariable("id") @NotNull Long idAdresse) {
        try {
            final var adresseEntity = adresseService.get(idAdresse);
            return adresseMapper.entityToDTO(adresseEntity);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "L'adresse demandée n'existe pas.", e);
        }
    }

    // création d'une nouvelle adresse
@PostMapping(value = "clients/{id}/adresses", consumes = MediaType.APPLICATION_JSON_VALUE)
@ResponseStatus(HttpStatus.CREATED)
public AdresseDTO newAddress(@PathVariable("id") @NotNull Long idClient,@RequestBody @Valid AdresseDTO adresseDTO) {
    try {
        // Vérifier si le client existe
        clientService.get(idClient);
        
        final var adresseEntity = adresseMapper.dtoToEntity(adresseDTO);
        final var savedAdresse = adresseService.save(idClient,adresseEntity);
        return adresseMapper.entityToDTO(savedAdresse);
    } catch (EntityNotFoundException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Le client demandé n'existe pas.", e);
    }
}


}

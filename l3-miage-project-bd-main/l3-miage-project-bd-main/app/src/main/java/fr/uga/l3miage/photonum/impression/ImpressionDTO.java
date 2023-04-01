package fr.uga.l3miage.photonum.impression;

import java.util.Collection;

import fr.uga.l3miage.photonum.client.ClientDTO;
import jakarta.persistence.*;

public record ImpressionDTO(
    @Id
    Long idImpression,
    
    Collection<ClientDTO> clients
    
    

) {
    
}

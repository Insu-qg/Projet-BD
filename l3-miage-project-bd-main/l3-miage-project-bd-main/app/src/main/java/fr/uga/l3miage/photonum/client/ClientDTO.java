package fr.uga.l3miage.photonum.client;

import java.util.Collection;
import fr.uga.l3miage.photonum.adresse.AdresseDTO;
import fr.uga.l3miage.photonum.commande.CommandeDTO;
import fr.uga.l3miage.photonum.image.ImageDTO;
import fr.uga.l3miage.photonum.impression.ImpressionDTO;

public record ClientDTO(
    Long idClient,
    String adresseMail,
    String nom,
    String prenom,
    String motDePasse,
    Collection<ImageDTO> images,
    Collection<AdresseDTO> adresses,
    Collection<ImpressionDTO> impressions,
    Collection<CommandeDTO> commandes


) {
    
}

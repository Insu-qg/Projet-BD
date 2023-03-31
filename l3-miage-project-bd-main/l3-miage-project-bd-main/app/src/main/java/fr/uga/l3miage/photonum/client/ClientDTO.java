package fr.uga.l3miage.photonum.client;

import java.util.Collection;
import fr.uga.l3miage.photonum.adresse.AdresseDTO;
import fr.uga.l3miage.photonum.commande.CommandeDTO;
import fr.uga.l3miage.photonum.image.ImageDTO;
import fr.uga.l3miage.photonum.impression.ImpressionDTO;
import jakarta.validation.constraints.*;

public record ClientDTO(
    Long idClient,
    @NotBlank
    @Email
    String adresseMail,
    @NotBlank
    String nom,
    @NotBlank
    String prenom,
    @NotBlank
    String motDePasse,

    Collection<ImageDTO> images,
    Collection<AdresseDTO> adresses,
    Collection<ImpressionDTO> impressions,
    Collection<CommandeDTO> commandes



){}

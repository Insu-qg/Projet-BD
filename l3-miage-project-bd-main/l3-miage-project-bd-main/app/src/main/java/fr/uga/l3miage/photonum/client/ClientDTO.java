package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.data.domain.Image;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.data.domain.Impression;
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
    List<Image> images,
    @NotNull
    List<Adresse> adresseClients,
    List<Impression> imprClients,
    List<Commande> commandeCLients
) {
    
}

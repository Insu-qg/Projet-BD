package fr.uga.l3miage.photonum.adresse;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import fr.uga.l3miage.photonum.client.ClientDTO;

public record AdresseDTO(
        @NotNull(message = "L'identifiant de l'adresse ne doit pas être null")
        @PositiveOrZero(message = "L'identifiant de l'adresse doit être positif ou zéro")
        Long idAdresse,
        
        @NotBlank(message = "Le nom de rue ne doit pas être vide")
        String nomRue,
        
        @NotBlank(message = "Le numéro ne doit pas être vide")
        String numero,
        
        @NotBlank(message = "La ville ne doit pas être vide")
        String ville,
        
        @NotBlank(message = "Le code postal ne doit pas être vide")
        @Pattern(regexp = "[0-9]{5}", message = "Le code postal doit contenir 5 chiffres")
        String codePostal,
        
        @NotNull(message = "L'identifiant du client ne doit pas être null")
        @PositiveOrZero(message = "L'identifiant du client doit être positif ou zéro")
        ClientDTO clientAdresse
) {}

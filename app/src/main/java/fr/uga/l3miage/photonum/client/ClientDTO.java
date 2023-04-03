package fr.uga.l3miage.photonum.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ClientDTO(
        Long idClient,
        @NotBlank(message = "L'adresse email ne peut pas être vide")
        @Email(message = "L'adresse email n'est pas valide")
        String email,
        @NotBlank(message = "Le nom ne peut pas être vide")
        String nom,
        @NotBlank(message = "Le prénom ne peut pas être vide")
        String prenoms,
        @NotBlank(message = "Le mot de passe ne peut pas être vide")
        @NotNull(message = "Le mot de passe ne doit pas être nul")
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_\\-!])(?=\\S+$).{8,20}$",
                message = "Le mot de passe doit contenir entre 8 et 20 caractères, au moins une lettre majuscule, une lettre minuscule, un chiffre, un caractère spécial et aucun espace.")
        String motDePasse
) {}
        
        

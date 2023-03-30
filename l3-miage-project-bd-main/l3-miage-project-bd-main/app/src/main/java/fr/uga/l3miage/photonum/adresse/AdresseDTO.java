package fr.uga.l3miage.photonum.adresse;

import jakarta.validation.constraints.*;

public record AdresseDTO(
        Long idAdresse,
        @NotBlank
        String nomRue,
        @Positive
        int numero,
        @NotBlank
        String ville,
        @NotBlank
        @Pattern(regexp = "[0-9]*")
        @Size(min = 0, max = 5)
        String codePostal


) {

}

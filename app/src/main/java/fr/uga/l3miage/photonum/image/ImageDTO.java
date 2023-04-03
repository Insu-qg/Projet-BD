package fr.uga.l3miage.photonum.image;

import fr.uga.l3miage.photonum.client.ClientDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ImageDTO(
        @NotNull Long idImage,
        @NotBlank String cheminAcces,
        @NotNull ClientDTO proprietaire,
        @Size(max = 255) String infosPriseDeVue,
        @Positive int resolutionEnMillionsDePixels,
        boolean estPartagee
) {}

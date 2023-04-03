package fr.uga.l3miage.photonum.photo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PhotoDTO(
        @NotNull Long idPhoto,
        @NotNull Long idImage,
        @NotBlank String parametresRetouches,
        @NotBlank String description
) {}

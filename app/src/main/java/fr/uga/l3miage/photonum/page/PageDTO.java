package fr.uga.l3miage.photonum.page;

import java.util.List;

import fr.uga.l3miage.photonum.photo.PhotoDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record PageDTO(
        @NotNull Long idPage,
        @PositiveOrZero int numero,
        @NotNull @NotBlank List<@NotNull PhotoDTO> photosSurPage
) {}


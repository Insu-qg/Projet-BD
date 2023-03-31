package fr.uga.l3miage.photonum.photo;

import fr.uga.l3miage.photonum.data.domain.Image;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PhotoDTO(
        Long idPhoto,
        @NotBlank
        String description,
        @NotBlank
        String paramRetouche,
        @NotNull
        Image image) {

}

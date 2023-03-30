package fr.uga.l3miage.photonum.image;

import fr.uga.l3miage.photonum.data.domain.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ImageDTO(

        Long idImage,
        @NotBlank
        String infoPriseDeVue,
        @NotNull
        Long resolution,
        @NotNull
        boolean share,
        @NotBlank
        String chemin,
        
        Client proprietaire

) {

}

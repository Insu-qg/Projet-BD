package fr.uga.l3miage.photonum.cadre;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadreDTO (
    @NotBlank
    String miseEnPage,
    @NotNull
    List<Photo> photoCadre
) {
    
}

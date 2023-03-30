package fr.uga.l3miage.photonum.tirage;

import java.util.Set;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.validation.constraints.NotEmpty;

public record TirageDTO(
    @NotEmpty
    Set<Photo> photosTirage
) {
    
}

package fr.uga.l3miage.photonum.page;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;
import java.util.Set;

public record PageDTO(
    Long id, 
    @NotNull
    @Positive
    int numero,
    @NotNull
    Set<Photo> photos

) {
    
}

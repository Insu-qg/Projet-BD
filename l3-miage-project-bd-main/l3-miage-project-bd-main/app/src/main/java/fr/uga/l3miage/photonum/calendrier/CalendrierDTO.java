package fr.uga.l3miage.photonum.calendrier;

import fr.uga.l3miage.photonum.data.domain.Page;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record CalendrierDTO(
    @NotNull
    int annee,
    @NotEmpty
    Set<Page> pagesCalendrier
) {
    
}

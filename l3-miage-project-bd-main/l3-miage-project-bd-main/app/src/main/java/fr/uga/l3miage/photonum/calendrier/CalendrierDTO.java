package fr.uga.l3miage.photonum.calendrier;

import fr.uga.l3miage.photonum.data.domain.Page;

import java.util.Set;

public record CalendrierDTO(
    int annee,
    Set<Page> pagesCalendrier
) {
    
}

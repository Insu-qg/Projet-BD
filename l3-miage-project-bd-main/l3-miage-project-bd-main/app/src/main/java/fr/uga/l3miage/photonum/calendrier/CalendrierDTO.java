package fr.uga.l3miage.photonum.calendrier;

import fr.uga.l3miage.photonum.page.PageDTO;

import java.util.Collection;

public record CalendrierDTO(
    int annee,
    Collection<PageDTO> pages
) {
    
}

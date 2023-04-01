package fr.uga.l3miage.photonum.calendrier;

import fr.uga.l3miage.photonum.page.PageDTO;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Collection;

public record CalendrierDTO(
    @NotNull
    int annee,
    @NotEmpty
    Collection<PageDTO> pages
    
    
){}

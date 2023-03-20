package fr.uga.l3miage.photonum.tirage;

import java.util.Set;

import fr.uga.l3miage.photonum.data.domain.Photo;

public record TirageDTO(
    Set<Photo> photosTirage
) {
    
}

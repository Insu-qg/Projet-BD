package fr.uga.l3miage.photonum.page;

import fr.uga.l3miage.photonum.data.domain.Photo;

import java.util.List;
import java.util.Set;

public record PageDTO(
    Long id, 
    int numero,
    Set<Photo> photos

) {
    
}

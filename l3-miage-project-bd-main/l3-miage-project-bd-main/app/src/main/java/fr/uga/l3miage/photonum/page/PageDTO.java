package fr.uga.l3miage.photonum.page;

import fr.uga.l3miage.photonum.data.domain.Photo;

import java.util.List;

public record PageDTO(
    Long id, 
    int numero,
    List<Photo> photos

) {
    
}

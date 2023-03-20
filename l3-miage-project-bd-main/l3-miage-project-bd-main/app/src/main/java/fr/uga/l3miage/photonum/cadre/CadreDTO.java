package fr.uga.l3miage.photonum.cadre;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Photo;

public record CadreDTO (
    String miseEnPage,
    List<Photo> photoCadre
) {
    
}

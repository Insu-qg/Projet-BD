package fr.uga.l3miage.photonum.cadre;

import java.util.Collection;
import fr.uga.l3miage.photonum.photo.PhotoDTO;

public record CadreDTO (
    String miseEnPage,
    Collection<PhotoDTO> photoDecadre
) {
    
}

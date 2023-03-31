package fr.uga.l3miage.photonum.exemplaire;

import fr.uga.l3miage.photonum.photo.PhotoDTO;
import fr.uga.l3miage.photonum.tirage.TirageDTO;

public record ExemplaireDTO(
    Long id, 
    int quantite,
    PhotoDTO photo,
    TirageDTO tirage

) {
    
}

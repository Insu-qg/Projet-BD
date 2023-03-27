package fr.uga.l3miage.photonum.exemplaire;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.data.domain.Tirage;

public record ExemplaireDTO(
    int quantite,
    Photo photo,
    Tirage tirage

) {
    
}

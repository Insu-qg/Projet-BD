package fr.uga.l3miage.photonum.photo;

import fr.uga.l3miage.photonum.image.ImageDTO;

public record PhotoDTO(
        Long idPhoto,
        String description,
        String retouche,
        ImageDTO  image) {

}

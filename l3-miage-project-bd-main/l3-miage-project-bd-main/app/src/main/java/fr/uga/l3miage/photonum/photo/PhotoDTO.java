package fr.uga.l3miage.photonum.photo;

import fr.uga.l3miage.photonum.data.domain.Image;

public record PhotoDTO(
        Long idPhoto,
        String description,
        String paramRetouche,
        Image image) {

}

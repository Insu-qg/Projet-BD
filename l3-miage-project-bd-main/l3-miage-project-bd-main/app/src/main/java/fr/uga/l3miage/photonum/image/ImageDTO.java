package fr.uga.l3miage.photonum.image;

import fr.uga.l3miage.photonum.data.domain.Client;

public record ImageDTO(

        Long idImage,
        String infoPriseDeVue,
        Long resolution,
        boolean share,
        String chemin,
        Client priprietaire

) {

}

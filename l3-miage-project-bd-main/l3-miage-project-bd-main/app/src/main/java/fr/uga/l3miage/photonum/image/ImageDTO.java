package fr.uga.l3miage.photonum.image;

import fr.uga.l3miage.photonum.client.ClientDTO;

public record ImageDTO(

        Long idImage,
        String infoPriseDeVue,
        Long resolution,
        boolean share,
        String chemin,
        ClientDTO proprietaire

) {

}

package fr.uga.l3miage.photonum.image;

public record ImageDTO (

    Long id,
    String infoPriseDeVue,
    Long resolution,
    boolean share,
    String chemin


) {
    
}

package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "Image")
public class Image {

    // ---- Attributs ----

    @Column(name = "chemin")
    private String chemin;

    @Column(name = "infoPriseDeVue")
    private String infoPriseDeVue;

    @Column(name = "resolution")
    private Long resolution;

    @Column(name = "share")
    private Boolean share;

    // ----- Associations -----

<<<<<<< HEAD
   @OneToOne
=======
    // à vérifier
    @OneToOne
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
    private Client proprietaire;

    // à vérifier
    @OneToMany
    private List<Photo> retouches;

}

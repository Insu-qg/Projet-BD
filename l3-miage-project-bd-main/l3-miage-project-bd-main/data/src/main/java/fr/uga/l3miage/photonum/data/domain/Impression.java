package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "Impression")
public class Impression {

    // ---- Attributs ----

    @Column(name = "idImpression")
    @Id
    @GeneratedValue
    private Long id; // remplacer par String si besoin

    @Column(name = "formatEtQual")
    @Enumerated
    private Reference formatEtQual; 

    // ----- Associations -----

    @OneToOne 
    private Commande commandeArticle;


}

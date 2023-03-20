package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Exemplaire")
public class Exemplaire {

    @Column(name = "quantite")
    private int quantite;

    @ManyToOne
    private Photo photo;

    @ManyToOne
    private Tirage tirage;

}

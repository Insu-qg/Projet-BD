package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

    @Column(name = "page")
    private int page;
    @Column(name = "numero")
    public Integer numero;

    // ----- Associations -----

    // voir comment gérer le 12 -> 1 (UML)
    @OneToOne
    public Album album;

    @OneToOne
    public Calendrier calendrier;
    
    @OneToMany
    public List<Photo> photoDecadre;
}

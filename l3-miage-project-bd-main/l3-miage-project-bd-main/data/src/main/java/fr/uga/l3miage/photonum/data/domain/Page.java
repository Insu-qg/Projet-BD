package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

    @Column(name = "idPage")
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "numero")
    public int numero;

    // ----- Associations -----

    
    @ManyToOne
    public Album album;

    // voir comment gérer le 12 -> 1 (UML)
    @OneToOne
    public Calendrier calendrier;
    
    // à vérifier
    @ManyToMany
    public List<Photo> photos;
}

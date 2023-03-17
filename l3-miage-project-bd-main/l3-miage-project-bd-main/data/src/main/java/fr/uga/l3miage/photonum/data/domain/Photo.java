package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Photo")
public class Photo {

    // ---- Attributs ----

    @Column(name = "description")
    private String description;

    @Column(name = "retouche")
    private String retouche;

    // ----- Associations -----

    @OneToOne
    private Image image;

    @ManyToMany
    private List<Page> pages;

    @ManyToMany
    private List<Tirage> tirages;

    @ManyToMany
    private List<Cadre> cadres;

    @OneToMany
    private Couverture couverture;

}

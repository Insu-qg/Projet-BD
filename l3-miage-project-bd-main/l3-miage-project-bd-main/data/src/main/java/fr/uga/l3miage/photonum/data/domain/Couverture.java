package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Couverture")
public class Couverture {

    // ---- Attributs ----

    @Column(name = "titre")
    private String titre;

    // ---- Associations ----

    @OneToMany
    private List<Album> albums;

    @ManyToOne
    private Photo photo;
}

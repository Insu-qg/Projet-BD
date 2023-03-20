package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Photo")
public class Photo {

    // ---- Attributs ----
    @Id
    @GeneratedValue
    private Long idPhoto;

    @Column(name = "description")
    private String description;

    @Column(name = "retouche")
    private String retouche;

    // ----- Associations -----

    @ManyToOne
    private Image image;

}

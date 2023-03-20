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
    private Long idPgae;

    @Column(name = "numero")
    private Long numero;

    // ----- Associations -----
    @ManyToMany
    private List<Photo> photos;

}

package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

    @Column(name = "page")
    private int page;

    // ----- Associations -----

    // voir comment gérer le 12 -> 1 (UML)
}

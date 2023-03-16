package fr.uga.l3miage.photonum.data.domain;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;


@Entity
@Table(name = "Commande")
public class Commande {

    // ---- Attributs ----

    @Column(name = "dateCommande")
    @DateTimeFormat
    private Date dateCommande;

    @Column(name = "prixTotal")
    private float prixTotal;

    // ----- Associations -----

    @ManyToOne
    private Client client;

    @ManyToOne
    private List<Adresse> adresses;

    @OneToMany
    private List<Impression> impressions;
}

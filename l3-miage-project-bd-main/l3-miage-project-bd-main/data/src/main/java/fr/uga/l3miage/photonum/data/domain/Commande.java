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
    public Date dateCommande;

    @Column(name = "prixTotal")
    public float prixTotal;

    // ----- Associations -----

    @OneToOne
    public Client client;

    @OneToOne
    public List<Adresse> adresses;

    @OneToMany
    public List<Impression> articles;
}

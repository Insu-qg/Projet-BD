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
    public double prixTotal;

    // ----- Associations -----

    // à vérifier
    @OneToOne
    public Client client;

    @OneToOne
    public Adresse adresseLivraison;

    @OneToMany
    public List<Impression> articles;
}

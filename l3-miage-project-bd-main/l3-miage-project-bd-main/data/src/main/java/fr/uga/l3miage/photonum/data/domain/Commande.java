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
<<<<<<< HEAD
    public float prixTotal;

    // ----- Associations -----

=======
    public double prixTotal;

    // ----- Associations -----

    // à vérifier
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
    @OneToOne
    public Client client;

    @OneToOne
<<<<<<< HEAD
    public List<Adresse> adresses;
=======
    public Adresse adresseLivraison;
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17

    @OneToMany
    public List<Impression> articles;
}

package fr.uga.l3miage.photonum.data.domain;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.*;


@Entity
@Table(name = "Commande")
public class Commande {

    // ---- Attributs ----
    @Id
    @GeneratedValue
    private Long idCommande;

    @Column(name = "dateCommande")
    @DateTimeFormat
    private Date dateCommande;

    @Column(name = "prixTotal")
    private double prixTotal;

    // ----- Associations -----

    @ManyToOne
    private Adresse adresseLivraison;

    @OneToMany
    private List<Article> articles;


}

package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    // ---- Attributs ----

    @Column(name = "idClient")
    @Id
    @GeneratedValue
    private Long idClient;

    @Column(name = "adresseMail")
    private String adresseMail;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "motDePasse")
    private String motDePasse;

    // ----- Associations -----

    @ManyToMany
    private List<Adresse> adresses;

    @OneToMany
    private List<Commande> commandes;

    @OneToMany
    private List<Image> images;

    @OneToMany
    private List<Impression> impressions;
}

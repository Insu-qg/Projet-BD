package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;



@Entity
@Table(name = "Adresse")
public class Adresse {

    // ---- Attributs ----

    @Column(name = "adresseLivraison")
    private String adresseLivraison;

    // ----- Associations -----

    @OneToMany
    private List<Commande> commandes;

    @ManyToOne
    private List<Client> clients;
}

package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;



@Entity
@Table(name = "Adresse")
public class Adresse {

    // ---- Attributs ----
    @Column(name = "idAdresse")
    @Id
    @GeneratedValue
    public Integer idAdresse;

    @Column(name = "nomRue")
    public String nomRue;

    @Column(name = "numero")
    public Integer numero;

    @Column(name = "ville")
    public String ville;

    @Column(name = "codePostal")
    public Integer codePostal;

    // ----- Associations -----

    @OneToMany
    private List<Commande> commandes;

    // @ManyToOne
    // private List<Client> clients;
}

package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdresse;

    private String nomRue;

    private String numero;

    private String ville;

    private String codePostal;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client clientAdresse;

    // Constructeur par défaut
    public Adresse() {}

    // Constructeur avec paramètres
    public Adresse(String nomRue, String numero, String ville, String codePostal, Client clientAdresse) {
        this.nomRue = nomRue;
        this.numero = numero;
        this.ville = ville;
        this.codePostal = codePostal;
        this.clientAdresse = clientAdresse;
    }

    // Getters et setters
    public Long getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse(Long idAdresse) {
        this.idAdresse = idAdresse;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Client getClientAdresse() {
        return clientAdresse;
    }

    public void setClient(Client clientAdresse) {
        this.clientAdresse = clientAdresse;
    }
}

package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Catalogue")
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCatalogue;

    @Column(name = "reference", unique = true, nullable = false)
    private Reference reference;

    public enum Reference{
        _10x15MAT,
        _10x13BRIL, 
        _CALA4BRIL, 
        _CADA3MAT
    }
    @Column(name = "type_impression", nullable = false)
    private String typeImpression;

    @Column(name = "prix", nullable = false)
    private double prix;

    public Long getIdCatalogue() {
        return idCatalogue;
    }

    public void setIdCatalogue(Long idCatalogue) {
        this.idCatalogue = idCatalogue;
    }

    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }

    public String getTypeImpression() {
        return typeImpression;
    }

    public void setTypeImpression(String typeImpression) {
        this.typeImpression = typeImpression;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}


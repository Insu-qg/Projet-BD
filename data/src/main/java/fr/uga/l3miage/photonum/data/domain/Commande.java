package fr.uga.l3miage.photonum.data.domain;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue
    private Long idCommande;
    
    @Column(name = "dateCommande")
    private Date dateCommande;
    
    @Column(name = "prixTotal")
    private Float prixTotal;

    @Column(name = "dateLivraison")
    private Date dateLivraison;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client proprietaireCommande;
    
    @ManyToMany
    private Set<Article> listeArticlesCommande;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public enum Status{
        INVALIDE,
        VALIDE,
        ENCOURS,
        LIVRE
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Client getProprietaireCommande() {
        return proprietaireCommande;
    }

    public void setProprietaireCommande(Client proprietaireCommande) {
        this.proprietaireCommande = proprietaireCommande;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<Article> getListeArticlesCommande() {
        return listeArticlesCommande;
    }

    public void setListeArticlesCommande(Set<Article> listeArticlesCommande) {
        this.listeArticlesCommande = listeArticlesCommande;
    }

    public void addArticle(Article article){
        if(this.status==Status.INVALIDE){
            this.listeArticlesCommande.add(article);
        }  
    }

    public void removeArticle(Article article){
        if(this.status==Status.INVALIDE){
            this.listeArticlesCommande.remove(article);
        }  
    }
}


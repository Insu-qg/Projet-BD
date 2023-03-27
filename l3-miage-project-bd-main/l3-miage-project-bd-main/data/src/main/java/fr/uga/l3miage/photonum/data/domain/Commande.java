package fr.uga.l3miage.photonum.data.domain;

import java.util.Date;
import java.util.List;
import java.util.Objects;

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



    /**
     * @return Long return the idCommande
     */
    public Long getIdCommande() {
        return idCommande;
    }

    /**
     * @param idCommande the idCommande to set
     */
    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    /**
     * @return Date return the dateCommande
     */
    public Date getDateCommande() {
        return dateCommande;
    }

    /**
     * @param dateCommande the dateCommande to set
     */
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    /**
     * @return double return the prixTotal
     */
    public double getPrixTotal() {
        return prixTotal;
    }

    /**
     * @param prixTotal the prixTotal to set
     */
    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    /**
     * @return Adresse return the adresseLivraison
     */
    public Adresse getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * @param adresseLivraison the adresseLivraison to set
     */
    public void setAdresseLivraison(Adresse adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    /**
     * @return List<Article> return the articles
     */
    public List<Article> getArticles() {
        return articles;
    }

    /**
     * @param articles the articles to set
     */
    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Commande commande = (Commande) o;
        return idCommande == commande.idCommande 
                && Objects.equals(dateCommande, commande.dateCommande)
                && prixTotal == commande.prixTotal;
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommande, dateCommande, prixTotal);
    }

}

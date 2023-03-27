package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;

import jakarta.persistence.*;


@Entity
@Table(name = "Article")
public class Article {

    // ---- Attributs ----
    @Id
    @GeneratedValue
    private Long idArticle;

    @Column(name = "prixImpression")
    private Double prixImpression;

    @Column(name = "formatEtQual")
    private FormatQual formatEtQual;

     // ----- Associations -----

     @ManyToOne
     private Catalogue catalogue;

     @OneToOne
     private Impression impression;


    /**
     * @return Long return the idArticle
     */
    public Long getIdArticle() {
        return idArticle;
    }

    /**
     * @param idArticle the idArticle to set
     */
    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    /**
     * @return Double return the prixImpression
     */
    public Double getPrixImpression() {
        return prixImpression;
    }

    /**
     * @param prixImpression the prixImpression to set
     */
    public void setPrixImpression(Double prixImpression) {
        this.prixImpression = prixImpression;
    }

    /**
     * @return FormatQual return the formatEtQual
     */
    public FormatQual getFormatEtQual() {
        return formatEtQual;
    }

    /**
     * @param formatEtQual the formatEtQual to set
     */
    public void setFormatEtQual(FormatQual formatEtQual) {
        this.formatEtQual = formatEtQual;
    }

    /**
     * @return Catalogue return the catalogue
     */
    public Catalogue getCatalogue() {
        return catalogue;
    }

    /**
     * @param catalogue the catalogue to set
     */
    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    /**
     * @return Impression return the impression
     */
    public Impression getImpression() {
        return impression;
    }

    /**
     * @param impression the impression to set
     */
    public void setImpression(Impression impression) {
        this.impression = impression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Article article = (Article) o;
        return idArticle == article.idArticle && prixImpression == article.prixImpression 
                && Objects.equals(formatEtQual, article.formatEtQual) ;
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, prixImpression, formatEtQual);
    }


}

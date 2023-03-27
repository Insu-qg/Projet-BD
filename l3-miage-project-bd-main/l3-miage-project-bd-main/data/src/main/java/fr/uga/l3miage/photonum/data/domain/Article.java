package fr.uga.l3miage.photonum.data.domain;

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

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Double getPrixImpression() {
        return prixImpression;
    }

    public void setPrixImpression(Double prixImpression) {
        this.prixImpression = prixImpression;
    }

    public FormatQual getFormatEtQual() {
        return formatEtQual;
    }

    public void setFormatEtQual(FormatQual formatEtQual) {
        this.formatEtQual = formatEtQual;
    }

    public Catalogue getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(Catalogue catalogue) {
        this.catalogue = catalogue;
    }

    public Impression getImpression() {
        return impression;
    }

    public void setImpression(Impression impression) {
        this.impression = impression;
    }

    @Column(name = "formatEtQual")
    private FormatQual formatEtQual;

     // ----- Associations -----

     @ManyToOne
     private Catalogue catalogue;

     @OneToOne
     private Impression impression;

}

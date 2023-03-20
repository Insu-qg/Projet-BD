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

    @Column(name = "formatEtQual")
    private FormatQual formatEtQual;

     // ----- Associations -----

     @ManyToOne
     private Catalogue catalogue;

     @OneToOne
     private Impression impression;

}

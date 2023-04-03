package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

import java.util.List;



@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Impression {
    
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Client proprietaireImpression;

    @OneToMany
    private List<Photo> photosImpressions;

    @ManyToOne
    private Article article;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getProprietaireImpression() {
        return proprietaireImpression;
    }

    public void setProprietaireImpression(Client proprietaireImpression) {
        this.proprietaireImpression = proprietaireImpression;
    }

    public List<Photo> getPhotosImpressions() {
        return photosImpressions;
    }

    public void setPhotosImpressions(List<Photo> photosImpressions) {
        this.photosImpressions = photosImpressions;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}

    

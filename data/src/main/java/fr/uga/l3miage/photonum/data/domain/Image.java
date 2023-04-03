package fr.uga.l3miage.photonum.data.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {
    
    @Id
    @GeneratedValue
    private Long idImage;
    
    @Column(name = "chemin_acces")
    private String cheminAcces;
    
    @ManyToOne
    //@JoinColumn(name = "idClient")
    private Client proprietaireImage;
    
    @Column(name = "infos_prise_de_vue")
    private String infosPriseDeVue;
    
    @Column(name = "resolution_en_millions_de_pixels")
    private int resolutionEnMillionsDePixels;
    
    @Column(name = "est_partagee")
    private boolean estPartagee;
    
    public Image() {
    }

    public Image(String cheminAcces, Client proprietaireImage, String infosPriseDeVue, int resolutionEnMillionsDePixels, boolean estPartagee) {
        this.cheminAcces = cheminAcces;
        this.proprietaireImage = proprietaireImage;
        this.infosPriseDeVue = infosPriseDeVue;
        this.resolutionEnMillionsDePixels = resolutionEnMillionsDePixels;
        this.estPartagee = estPartagee;
    }
    
    // Getters and Setters

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public String getCheminAcces() {
        return cheminAcces;
    }

    public void setCheminAcces(String cheminAcces) {
        this.cheminAcces = cheminAcces;
    }

    public Client getProprietaireImage() {
        return proprietaireImage;
    }

    public void setProprietaireImage(Client proprietaireImage) {
        this.proprietaireImage = proprietaireImage;
    }

    public String getInfosPriseDeVue() {
        return infosPriseDeVue;
    }

    public void setInfosPriseDeVue(String infosPriseDeVue) {
        this.infosPriseDeVue = infosPriseDeVue;
    }

    public int getResolutionEnMillionsDePixels() {
        return resolutionEnMillionsDePixels;
    }

    public void setResolutionEnMillionsDePixels(int resolutionEnMillionsDePixels) {
        this.resolutionEnMillionsDePixels = resolutionEnMillionsDePixels;
    }

    public boolean isEstPartagee() {
        return estPartagee;
    }

    public void setEstPartagee(boolean estPartagee) {
        this.estPartagee = estPartagee;
    }
    
}
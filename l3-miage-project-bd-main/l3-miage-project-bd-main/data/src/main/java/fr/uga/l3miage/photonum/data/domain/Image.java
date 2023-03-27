package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "Image")
public class Image {

    // ---- Attributs ----
    @Id
    @GeneratedValue
    private Long idImage;

    @Column(name = "chemin")
    private String chemin;

    @Column(name = "infoPriseDeVue")
    private String infoPriseDeVue;

    @Column(name = "resolution")
    private Long resolution;

    @Column(name = "share")
    private Boolean share;

    // ----- Associations -----
    @ManyToOne
    private Client proprietaire;



    /**
     * @return Long return the idImage
     */
    public Long getIdImage() {
        return idImage;
    }

    /**
     * @param idImage the idImage to set
     */
    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    /**
     * @return String return the chemin
     */
    public String getChemin() {
        return chemin;
    }

    /**
     * @param chemin the chemin to set
     */
    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    /**
     * @return String return the infoPriseDeVue
     */
    public String getInfoPriseDeVue() {
        return infoPriseDeVue;
    }

    /**
     * @param infoPriseDeVue the infoPriseDeVue to set
     */
    public void setInfoPriseDeVue(String infoPriseDeVue) {
        this.infoPriseDeVue = infoPriseDeVue;
    }

    /**
     * @return Long return the resolution
     */
    public Long getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Long resolution) {
        this.resolution = resolution;
    }

    /**
     * @return Boolean return the share
     */
    public Boolean isShare() {
        return share;
    }

    /**
     * @param share the share to set
     */
    public void setShare(Boolean share) {
        this.share = share;
    }

    /**
     * @return Client return the proprietaire
     */
    public Client getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

}

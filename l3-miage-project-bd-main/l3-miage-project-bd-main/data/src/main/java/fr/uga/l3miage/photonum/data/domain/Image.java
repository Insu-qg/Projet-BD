package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;

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
    private boolean share;

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
    public boolean isShare() {
        return share;
    }

    /**
     * @param share the share to set
     */
    public void setShare(boolean share) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Image image = (Image) o;
        return idImage == image.idImage  && Objects.equals(chemin, image.chemin)
                && Objects.equals(infoPriseDeVue, image.infoPriseDeVue) 
                && resolution == image.resolution;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idImage, infoPriseDeVue, resolution, share);
    }

}

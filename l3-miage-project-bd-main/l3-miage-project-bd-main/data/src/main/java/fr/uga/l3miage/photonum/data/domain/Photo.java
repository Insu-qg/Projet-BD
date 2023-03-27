package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Photo")
public class Photo {

    // ---- Attributs ----
    @Id
    @GeneratedValue
    private Long idPhoto;

    @Column(name = "description")
    private String description;

    @Column(name = "retouche")
    private String retouche;

    // ----- Associations -----

    @ManyToOne
    private Image image;


    /**
     * @return Long return the idPhoto
     */
    public Long getIdPhoto() {
        return idPhoto;
    }

    /**
     * @param idPhoto the idPhoto to set
     */
    public void setIdPhoto(Long idPhoto) {
        this.idPhoto = idPhoto;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String return the retouche
     */
    public String getRetouche() {
        return retouche;
    }

    /**
     * @param retouche the retouche to set
     */
    public void setRetouche(String retouche) {
        this.retouche = retouche;
    }

    /**
     * @return Image return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

}

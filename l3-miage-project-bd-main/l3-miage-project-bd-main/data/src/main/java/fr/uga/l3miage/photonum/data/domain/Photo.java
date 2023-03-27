package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Photo photo = (Photo) o;
        return idPhoto == photo.idPhoto && Objects.equals(description, photo.description)
                && Objects.equals(retouche, photo.retouche) 
                && Objects.equals(image, photo.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPhoto, description, retouche, image);
    }

}

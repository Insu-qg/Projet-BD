package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPhoto;

    @ManyToOne
    private Image image;

    @Column(name = "parametres_retouches")
    private String parametresRetouches;

    @Column(name = "description")
    private String description;

    public Long getIdPhoto() {
        return idPhoto;
    }

    public void setId(Long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getParametresRetouches() {
        return parametresRetouches;
    }

    public void setParametresRetouches(String parametresRetouches) {
        this.parametresRetouches = parametresRetouches;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

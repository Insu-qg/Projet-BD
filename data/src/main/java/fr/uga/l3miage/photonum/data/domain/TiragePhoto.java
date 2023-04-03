package fr.uga.l3miage.photonum.data.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TiragePhoto {
    
    @Id
    @GeneratedValue
    private Long idTiragePhoto;
    
    @ManyToOne
    private Tirage tirage;
    
    @ManyToOne
    private Photo photo;
    
    private int quantite;
    
    // Getters and setters
    public Long getIdTiragePhoto() {
        return idTiragePhoto;
    }
    
    public void setIdTiragePhoto(Long idTiragePhoto) {
        this.idTiragePhoto = idTiragePhoto;
    }
    
    public Tirage getTirage() {
        return tirage;
    }
    
    public void setTirage(Tirage tirage) {
        this.tirage = tirage;
    }
    
    public Photo getPhoto() {
        return photo;
    }
    
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
    
    public int getQuantite() {
        return quantite;
    }
    
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}

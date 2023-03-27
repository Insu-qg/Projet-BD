package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Exemplaire")
public class Exemplaire {

    @Column(name = "quantite")
    private int quantite;

    @ManyToOne
    private Photo photo;

    @ManyToOne
    private Tirage tirage;


    /**
     * @return int return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return Photo return the photo
     */
    public Photo getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    /**
     * @return Tirage return the tirage
     */
    public Tirage getTirage() {
        return tirage;
    }

    /**
     * @param tirage the tirage to set
     */
    public void setTirage(Tirage tirage) {
        this.tirage = tirage;
    }

}

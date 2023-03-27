package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Exemplaire exemplaire = (Exemplaire) o;
        return quantite == exemplaire.quantite 
                && Objects.equals(photo, exemplaire.photo)
                && Objects.equals(tirage, exemplaire.tirage);
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantite,photo,tirage);
    }


}

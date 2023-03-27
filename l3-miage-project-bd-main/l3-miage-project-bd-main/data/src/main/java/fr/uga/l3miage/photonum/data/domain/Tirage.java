package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Tirage")
public class Tirage extends Impression{

    @ManyToMany
    private List<Photo> photosTirage;
    

    /**
     * @return List<Photo> return the photosTirage
     */
    public List<Photo> getPhotosTirage() {
        return photosTirage;
    }

    /**
     * @param photosTirage the photosTirage to set
     */
    public void setPhotosTirage(List<Photo> photosTirage) {
        this.photosTirage = photosTirage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Tirage tirage = (Tirage) o;
        return Objects.equals(photosTirage, tirage.photosTirage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photosTirage);
    }

}

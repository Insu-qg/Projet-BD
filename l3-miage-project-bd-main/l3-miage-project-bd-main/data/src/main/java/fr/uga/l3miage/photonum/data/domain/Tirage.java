package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

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
}

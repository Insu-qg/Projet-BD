package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Tirage extends Impression {

    @OneToMany
    private Set<Photo> tiragePhotos;

    // Getters and setters

    public Set<Photo> getTiragePhotos() {
        return tiragePhotos;
    }
    public void setTiragePhotos(Set<Photo> tiragePhotos) {
        this.tiragePhotos = tiragePhotos;
    }
}

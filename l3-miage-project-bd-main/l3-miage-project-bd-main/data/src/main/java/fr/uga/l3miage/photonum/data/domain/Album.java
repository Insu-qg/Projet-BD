package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Album")
public class Album extends Impression{

    @Column(name = "titreCouverture")
    private String titreCouverture;

    public String getTitreCouverture() {
        return titreCouverture;
    }

    public void setTitreCouverture(String titreCouverture) {
        this.titreCouverture = titreCouverture;
    }

    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @OneToMany
    private Set<Page> pages;

    @ManyToOne
    private Photo photo;
    

    
}

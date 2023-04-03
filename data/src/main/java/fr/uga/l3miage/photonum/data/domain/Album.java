package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Album extends Impression{
    
    @Column( name = "titreCouverture")
    private String titreCouverture;

    @ManyToOne
    private Photo photoCouverture;

    @ManyToMany
    private List<Page> pages;

    public String getTitreCouverture() {
        return this.titreCouverture;
    }

    public void setTitreCouverture(String titreCouverture) {
        this.titreCouverture = titreCouverture;
    }

    public void addPage(Page page) {
        // TODO
    }

    public void addPages(List<Page> pages) {
        // TODO
    }

    public List<Page> getPages() {
        // TODO
        return this.pages;
    }

    
    public Photo getPhotoCouverture() {
        return photoCouverture;
    }
    
    public void setPhotoCouverture(Photo photoCouverture) {
        this.photoCouverture = photoCouverture;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
    
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Album) || other == null){
            return false;
        }
        Album otherAlbum = (Album) other;
    
        return otherAlbum.getPages().equals(this.pages)
        && otherAlbum.getTitreCouverture().equals(this.titreCouverture)
        && otherAlbum.getPhotoCouverture().equals(this.photoCouverture);
    }
}

package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("album")
public class Album extends Impression{

    @Column(name = "titreCouverture")
    private String titreCouverture;

    @OneToMany
    private Set<Page> pages;

    @ManyToOne
    private Photo photo;
    

    /**
     * @return String return the titreCouverture
     */
    public String getTitreCouverture() {
        return titreCouverture;
    }

    /**
     * @param titreCouverture the titreCouverture to set
     */
    public void setTitreCouverture(String titreCouverture) {
        this.titreCouverture = titreCouverture;
    }

    /**
     * @return Set<Page> return the pages
     */
    public Set<Page> getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(Set<Page> pages) {
        this.pages = pages;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Album album = (Album) o;
        return  
                Objects.equals(titreCouverture, album.titreCouverture)
                && Objects.equals(pages, album.pages)
                && Objects.equals(photo, album.photo) ;
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(titreCouverture, pages, photo);
    }


}

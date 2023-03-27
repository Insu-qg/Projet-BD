package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

    @Column(name = "idPage")
    @Id
    @GeneratedValue
    private Long idPage;

    @Column(name = "numero")
    private Long numero;

    // ----- Associations -----
    @ManyToMany
    private Set<Photo> photos;


    /**
     * @return Long return the idPage
     */
    public Long getIdPage() {
        return idPage;
    }

    /**
     * @param idPage the idPgae to set
     */
    public void setIdPgae(Long idPage) {
        this.idPage = idPage;
    }

    /**
     * @return Long return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return Set<Photo> return the photos
     */
    public Set<Photo> getPhotos() {
        return photos;
    }

    /**
     * @param photos the photos to set
     */
    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Page page = (Page) o;
        return idPage == page.idPage && numero == page.numero && Objects.equals(photos, page.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPage, numero, photos);
    }

}

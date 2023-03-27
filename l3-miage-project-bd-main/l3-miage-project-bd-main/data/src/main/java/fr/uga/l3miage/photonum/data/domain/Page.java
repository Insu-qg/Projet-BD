package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

    @Column(name = "idPage")
    @Id
    @GeneratedValue
    private Long idPgae;

    @Column(name = "numero")
    private Long numero;

    // ----- Associations -----
    @ManyToMany
    private Set<Photo> photos;


    /**
     * @return Long return the idPgae
     */
    public Long getIdPgae() {
        return idPgae;
    }

    /**
     * @param idPgae the idPgae to set
     */
    public void setIdPgae(Long idPgae) {
        this.idPgae = idPgae;
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

}

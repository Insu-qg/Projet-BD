package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadre")
public class Cadre extends Impression{

    @Column(name = "miseEnPage")
    private String miseEnPage;

    @ManyToMany
    private List<Photo> photoDecadre;


    /**
     * @return String return the miseEnPage
     */
    public String getMiseEnPage() {
        return miseEnPage;
    }

    /**
     * @param miseEnPage the miseEnPage to set
     */
    public void setMiseEnPage(String miseEnPage) {
        this.miseEnPage = miseEnPage;
    }

    /**
     * @return List<Photo> return the photoDecadre
     */
    public List<Photo> getPhotoDecadre() {
        return photoDecadre;
    }

    /**
     * @param photoDecadre the photoDecadre to set
     */
    public void setPhotoDecadre(List<Photo> photoDecadre) {
        this.photoDecadre = photoDecadre;
    }

}

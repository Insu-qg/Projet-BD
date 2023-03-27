package fr.uga.l3miage.photonum.data.domain;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
    Cadre cadre = (Cadre) o;
        return Objects.equals(miseEnPage, cadre.miseEnPage) 
                && Objects.equals(photoDecadre, cadre.photoDecadre) ;
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(miseEnPage, photoDecadre);
    }


}

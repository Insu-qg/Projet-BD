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

    public String getMiseEnPage() {
        return miseEnPage;
    }

    public void setMiseEnPage(String miseEnPage) {
        this.miseEnPage = miseEnPage;
    }

    public List<Photo> getPhotoDecadre() {
        return photoDecadre;
    }

    public void setPhotoDecadre(List<Photo> photoDecadre) {
        this.photoDecadre = photoDecadre;
    }

}

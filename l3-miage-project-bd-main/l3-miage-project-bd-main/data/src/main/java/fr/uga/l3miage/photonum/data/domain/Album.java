package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Album")
public class Album extends Impression{

<<<<<<< HEAD
    @ManyToOne
=======
    @Column(name = "titreCouverture")
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
    public String titreCouverture;

    // à vérifier
    @OneToMany
    private List<Page> pages;
}

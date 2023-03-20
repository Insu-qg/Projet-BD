package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadre")
public class Cadre extends Impression{
<<<<<<< HEAD
    @Column
    public String miseEnPage;
    @OneToMany
=======
    
    @Column(name = "miseEnPage")
    public String miseEnPage;
    
    // à vérifier
    @ManyToMany
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
    public List<Photo> photoDecadre;

}

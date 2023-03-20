package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "Page")
public class Page {

    // ---- Attributs ----

<<<<<<< HEAD
    @Column(name = "page")
    private int page;
    @Column(name = "numero")
    public Integer numero;
=======
    @Column(name = "idPage")
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "numero")
    public int numero;
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17

    // ----- Associations -----

    
    @ManyToOne
    public Album album;

    // voir comment gérer le 12 -> 1 (UML)
    @OneToOne
<<<<<<< HEAD
    public Album album;

    @OneToOne
    public Calendrier calendrier;
    
    @OneToMany
    public List<Photo> photoDecadre;
=======
    public Calendrier calendrier;
    
    // à vérifier
    @ManyToMany
    public List<Photo> photos;
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
}

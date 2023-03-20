package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;

public class Calendrier extends Impression {
    // ---- Attributs ----
<<<<<<< HEAD
    @Column
    public Integer année;
    
    // ----- Associations -----
=======
    @Column(name = "annee")
    public Integer annee;
    
    // ----- Associations -----

    
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
}

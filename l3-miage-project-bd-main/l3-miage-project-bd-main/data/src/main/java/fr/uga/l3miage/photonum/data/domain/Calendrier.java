package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;

public class Calendrier extends Impression {
    // ---- Attributs ----
    @Column
    public Integer année;
    
    // ----- Associations -----
}

package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadre")
public class Cadre extends Impression{
    
    public String miseEnPage;
    @OneToMany
    public List<Photo> photoDecadre;

}

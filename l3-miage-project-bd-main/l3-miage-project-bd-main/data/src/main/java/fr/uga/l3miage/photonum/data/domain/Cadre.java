package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Cadre")
public class Cadre extends Impression{
    @Column
    public String miseEnPage;
    @OneToMany
    public List<Photo> photoDecadre;

}

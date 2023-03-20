package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Tirage")
public class Tirage extends Impression{

    @ManyToMany
    private List<Photo> photosTirage;
}

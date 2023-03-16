package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Album")
public class Album extends Impression{

    @ManyToOne
    private Couverture couverture;

    @OneToMany
    private List<Page> pages;
}

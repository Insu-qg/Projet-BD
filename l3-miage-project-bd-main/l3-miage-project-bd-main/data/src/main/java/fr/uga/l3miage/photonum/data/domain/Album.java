package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "Album")
public class Album extends Impression{

    @Column(name = "titreCouverture")
    private String titreCouverture;

    @OneToMany
    private List<Page> pages;

    @ManyToOne
    private Photo photo;
    
}

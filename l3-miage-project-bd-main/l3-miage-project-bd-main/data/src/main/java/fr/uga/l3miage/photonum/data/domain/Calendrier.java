package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class Calendrier extends Impression {

    @Column(name = "annee")
    private Integer annee;

    @OneToMany
    private List<Page> pages;

    
}
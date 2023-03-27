package fr.uga.l3miage.photonum.data.domain;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class Calendrier extends Impression {

    @Column(name = "annee")
    private Integer annee;

    @OneToMany
    private Set<Page> pages;


    /**
     * @return Integer return the annee
     */
    public Integer getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    /**
     * @return Set<Page> return the pages
     */
    public Set<Page> getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

}

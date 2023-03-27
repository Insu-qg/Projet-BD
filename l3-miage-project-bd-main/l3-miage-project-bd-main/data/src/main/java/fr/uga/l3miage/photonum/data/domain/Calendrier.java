package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class Calendrier extends Impression {

    @Column(name = "annee")
    private int annee;

    @OneToMany
    private Set<Page> pages;


    /**
     * @return Int return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
    Calendrier calendrier = (Calendrier) o;
        return annee == calendrier.annee 
                && Objects.equals(pages, calendrier.pages) ;
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(annee, pages);
    }

}

package fr.uga.l3miage.photonum.data.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Calendrier")
@PrimaryKeyJoinColumn(name = "idImpression")
public class Calendrier extends Impression {

    @Column(name = "year")
    private int year;

    @OneToMany
    private List<Page> pagesCalendrier;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Page> getPages() {
        return pagesCalendrier;
    }

    public void setPagesCalendrier(List<Page> pagesCalendrier) {
        this.pagesCalendrier = pagesCalendrier;
    }

    public void addPageCalendrier(Page pageCalendrier) {
        pagesCalendrier.add(pageCalendrier);
    }

    public void removePage(Page pageCalendrier) {
        pagesCalendrier.remove(pageCalendrier);
    }
}

package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Catalogue")

public class Catalogue {
    @Column
    public FormatQual referenceImpr;
    @Column
    public String typeImpr;
    @Column
    public double prixParPhoto;
}

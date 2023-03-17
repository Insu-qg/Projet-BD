package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Catalogue")
public class Catalogue {
    
    @Column(name = "referenceImpr")
    public FormatQual referenceImpr;
    
    @Column(name = "typeImpr")
    public String typeImpr;
    
    @Column(name = "prixParPhoto")
    public double prixParPhoto;
}

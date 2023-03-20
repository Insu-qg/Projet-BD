package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Catalogue")
public class Catalogue {

    @Id
    @GeneratedValue
    private Long idCatalogue;
    
    @Column(name = "referenceImpr")
    private FormatQual referenceImpr;
    
    @Column(name = "typeImpr")
    private String typeImpr;
    
    @Column(name = "prixParPhoto")
    private Long prixParPhoto;
    
}

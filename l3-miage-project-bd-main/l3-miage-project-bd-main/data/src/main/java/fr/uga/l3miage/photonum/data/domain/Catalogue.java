package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Catalogue")
<<<<<<< HEAD

public class Catalogue {
    @Column
    public FormatQual referenceImpr;
    @Column
    public String typeImpr;
    @Column
=======
public class Catalogue {
    
    @Column(name = "referenceImpr")
    public FormatQual referenceImpr;
    
    @Column(name = "typeImpr")
    public String typeImpr;
    
    @Column(name = "prixParPhoto")
>>>>>>> 867e22bbfdb4820760ac0ba782e55bf424061c17
    public double prixParPhoto;
}

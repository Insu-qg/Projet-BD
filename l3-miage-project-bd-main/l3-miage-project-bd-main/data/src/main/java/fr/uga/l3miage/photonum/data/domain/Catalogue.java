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
    public double prixParPhoto;


    /**
     * @return Long return the idCatalogue
     */
    public Long getIdCatalogue() {
        return idCatalogue;
    }

    /**
     * @param idCatalogue the idCatalogue to set
     */
    public void setIdCatalogue(Long idCatalogue) {
        this.idCatalogue = idCatalogue;
    }

    /**
     * @return FormatQual return the referenceImpr
     */
    public FormatQual getReferenceImpr() {
        return referenceImpr;
    }

    /**
     * @param referenceImpr the referenceImpr to set
     */
    public void setReferenceImpr(FormatQual referenceImpr) {
        this.referenceImpr = referenceImpr;
    }

    /**
     * @return String return the typeImpr
     */
    public String getTypeImpr() {
        return typeImpr;
    }

    /**
     * @param typeImpr the typeImpr to set
     */
    public void setTypeImpr(String typeImpr) {
        this.typeImpr = typeImpr;
    }

}

package fr.uga.l3miage.photonum.data.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
    Catalogue catalogue = (Catalogue) o;
        return idCatalogue == catalogue.idCatalogue
                && prixParPhoto == catalogue.prixParPhoto
                && Objects.equals(referenceImpr, catalogue.referenceImpr) 
                && Objects.equals(typeImpr, catalogue.typeImpr);
                
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCatalogue, prixParPhoto, referenceImpr, typeImpr);
    }

}

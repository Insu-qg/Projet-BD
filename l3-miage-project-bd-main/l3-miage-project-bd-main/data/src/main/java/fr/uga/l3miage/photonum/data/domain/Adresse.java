package fr.uga.l3miage.photonum.data.domain;



import java.util.Objects;

import jakarta.persistence.*;



@Entity
@Table(name = "Adresse")
public class Adresse {

    // ---- Attributs ----
    @Column(name = "idAdresse")
    @Id
    @GeneratedValue
    private Long idAdresse;

    @Column(name = "nomRue")
    private String nomRue;

    @Column(name = "numero")
    private int numero;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codePostal")
    private String codePostal;


    /**
     * @return Long return the idAdresse
     */
    public Long getIdAdresse() {
        return idAdresse;
    }

    /**
     * @param idAdresse the idAdresse to set
     */
    public void setIdAdresse(Long idAdresse) {
        this.idAdresse = idAdresse;
    }

    /**
     * @return String return the nomRue
     */
    public String getNomRue() {
        return nomRue;
    }

    /**
     * @param nomRue the nomRue to set
     */
    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return String return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return Integer return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param codePostal the codePostal to set
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Adresse adresse = (Adresse) o;
        return idAdresse == adresse.idAdresse && numero == adresse.numero 
                && Objects.equals(nomRue, adresse.nomRue) 
                && Objects.equals(ville, adresse.ville)
                && Objects.equals(codePostal, adresse.codePostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdresse,nomRue, numero, ville, codePostal);
    }

}

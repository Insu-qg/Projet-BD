package fr.uga.l3miage.photonum.data.domain;



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
    private Integer codePostal;

}

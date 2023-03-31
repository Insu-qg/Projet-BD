package fr.uga.l3miage.photonum.data.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    // ---- Attributs ----

    @Column(name = "idClient")
    @Id
    @GeneratedValue
    private Long idClient;

    @Column(name = "adresseMail")
    private String adresseMail;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "motDePasse")
    private String motDePasse;

    // ----- Associations -----

    @ManyToMany
    private List<Adresse> adresses;

    @OneToMany
    private List<Commande> commandes;

    @OneToMany
    private List<Image> images;

    @ManyToMany
    private Set<Impression> impressions;

    /**
     * @return Long return the idClient
     */
    public Long getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    /**
     * @return String return the adresseMail
     */
    public String getAdresseMail() {
        return adresseMail;
    }

    /**
     * @param adresseMail the adresseMail to set
     */
    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return String return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    /**
     * @return List<Adresse> return the adresses
     */
    public List<Adresse> getAdresses() {
        return adresses;
    }

    /**
     * @param adresses the adresses to set
     */
    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

    /**
     * @return List<Commande> return the commandes
     */
    public List<Commande> getCommandes() {
        return commandes;
    }

    /**
     * @param commandes the commandes to set
     */
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    /**
     * @return List<Image> return the images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * @return List<Impression> return the impressions
     */
    public Set<Impression> getImpressions() {
        return impressions;
    }

    /**
     * @param impressions the impressions to set
     */
    public void setImpressions(Set<Impression> impressions) {
        this.impressions = impressions;
    }

    public void addImpression(Impression impression) {
        if (this.impressions == null) {
            this.impressions = new HashSet<>();
        }
        this.impressions.add(impression);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Client client = (Client) o;
        return idClient == client.idClient 
                && Objects.equals(adresseMail, client.adresseMail)
                && Objects.equals(nom, client.nom)
                && Objects.equals(prenom, client.prenom)
                && Objects.equals(motDePasse, client.motDePasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient,adresseMail,nom,prenom,motDePasse);
    }

}

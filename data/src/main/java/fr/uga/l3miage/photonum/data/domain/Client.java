package fr.uga.l3miage.photonum.data.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue
    private Long idClient;

    private String email;

    private String nom;

    private String prenoms;

    private String motDePasse;

    @OneToMany(mappedBy = "proprietaireImage")
    private List<Image> images = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Impression> impressions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> adresses = new ArrayList<>();

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long id) {
        this.idClient = idClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void addImage(Image image) {
        images.add(image);
        image.setProprietaireImage(this);
    }

    public void removeImage(Image image) {
        images.remove(image);
        image.setProprietaireImage(null);
    }

    public List<Impression> getImpressions() {
        return impressions;
    }

    public void setImpressions(List<Impression> impressions) {
        this.impressions = impressions;
    }

    public void addImpression(Impression impression) {
        impressions.add(impression);
        impression.setProprietaireImpression(this);
    }

    public void removeImpression(Impression impression) {
        impressions.remove(impression);
        impression.setProprietaireImpression(null);
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    public void addCommande(Commande commande) {
        commandes.add(commande);
        commande.setProprietaireCommande(this);
    }

    public void removeCommande(Commande commande) {
        commandes.remove(commande);
        commande.setProprietaireCommande(null);
    }

}

package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.data.domain.Image;

import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.data.domain.Impression;

public record ClientDTO(
    Long idClient,
    String adresseMail,
    String nom,
    String prenom,
    String motDePasse,
    List<Image> images,
    List<Adresse> adresseClients,
    List<Impression> imprClients,
    List<Commande> commandeCLients


) {
    
}

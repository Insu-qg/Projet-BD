package fr.uga.l3miage.photonum.commande;

import java.sql.Date;
import java.util.Collection;
import fr.uga.l3miage.photonum.adresse.AdresseDTO;
import fr.uga.l3miage.photonum.article.ArticleDTO;

public record CommandeDTO (
    Long idCommande,
    Date dateCommande,
    double prixTotal,
    String status,
    Collection<ArticleDTO> articles,
    AdresseDTO adresseLivraison

) {
    
}

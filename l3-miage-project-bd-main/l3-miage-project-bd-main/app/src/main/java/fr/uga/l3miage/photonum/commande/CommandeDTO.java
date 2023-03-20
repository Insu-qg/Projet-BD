package fr.uga.l3miage.photonum.commande;

import java.sql.Date;
import java.util.List;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Article;

public record CommandeDTO (
    Long idCommande,
    Date dateCommande,
    Double prixTotal,
    List<Article> articlesCommande,
    Adresse adresseCommande

) {
    
}

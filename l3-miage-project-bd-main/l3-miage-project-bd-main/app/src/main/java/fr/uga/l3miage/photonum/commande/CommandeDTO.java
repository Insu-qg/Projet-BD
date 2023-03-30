package fr.uga.l3miage.photonum.commande;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.data.domain.Article;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record CommandeDTO (
    Long idCommande,
    @DateTimeFormat
    Date dateCommande,
    @DecimalMin(value = "0.00")
    Double prixTotal,
    @NotEmpty
    List<Article> articlesCommande,
    @NotNull
    Adresse adresseCommande

) {
    
}

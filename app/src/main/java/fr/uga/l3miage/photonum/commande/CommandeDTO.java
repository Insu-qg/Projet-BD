package fr.uga.l3miage.photonum.commande;

import java.util.Date;
import java.util.Set;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import fr.uga.l3miage.photonum.article.ArticleDTO;
import fr.uga.l3miage.photonum.client.ClientDTO;
import fr.uga.l3miage.photonum.data.domain.Commande.Status;

public record CommandeDTO(
    Long idCommande,

    @NotNull
    @PastOrPresent
    Date dateCommande,

    @NotNull
    @PositiveOrZero
    Float prixTotal,

    Date dateLivraison,

    @NotNull
    ClientDTO proprietaireCommande,

    @NotNull
    @Size(min = 1)
    Set<ArticleDTO> listeArticlesCommande,

    @NotNull
    Status status
) {}

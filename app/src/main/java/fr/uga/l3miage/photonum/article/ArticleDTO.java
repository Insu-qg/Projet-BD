package fr.uga.l3miage.photonum.article;

import fr.uga.l3miage.photonum.impression.ImpressionDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ArticleDTO(
        @NotNull Long idArticle,
        @NotNull Long idImpression,
        @Positive int quantite,
        @NotNull Long idCatalogue,
        @NotNull ImpressionDTO Impression
) {}

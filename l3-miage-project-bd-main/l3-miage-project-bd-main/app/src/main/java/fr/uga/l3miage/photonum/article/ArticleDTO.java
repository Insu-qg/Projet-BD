package fr.uga.l3miage.photonum.article;

import jakarta.validation.constraints.*;
import fr.uga.l3miage.photonum.data.domain.Catalogue;

public record ArticleDTO(
        Long idArticle,
        @DecimalMin(value = "0.00")
        Double prixImpression,

        String formatEtQual,
        
        Catalogue catalogue


) {}


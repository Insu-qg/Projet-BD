package fr.uga.l3miage.photonum.article;

import fr.uga.l3miage.photonum.data.domain.Impression;
import jakarta.validation.constraints.*;
import fr.uga.l3miage.photonum.data.domain.FormatQual;
import fr.uga.l3miage.photonum.data.domain.Catalogue;

public record ArticleDTO(
        Long idArticle,
        @DecimalMin(value = "0.00")
        Double prixImpression,
        @NotNull
        FormatQual formatEtQual,
        Impression impression,
        Catalogue catalogue

) {

}

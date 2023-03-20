package fr.uga.l3miage.photonum.article;

import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.data.domain.FormatQual;
import fr.uga.l3miage.photonum.data.domain.Catalogue;

public record ArticleDTO(
        Long idArticle,
        Double prixImpression,
        FormatQual formatEtQual,
        Impression impression,
        Catalogue catalogue

) {

}

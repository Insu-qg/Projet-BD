package fr.uga.l3miage.photonum.catalogue;

import fr.uga.l3miage.photonum.data.domain.TypeImpression;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record CatalogueDTO(
    @NotNull(message = "L'identifiant du catalogue ne doit pas être nul") 
    Long idCatalogue,
    @NotNull(message = "La référence du catalogue ne doit pas être nulle") 
    Reference reference,
    @NotBlank(message = "Le type d'impression ne doit pas être vide") 
    TypeImpression typeImpression,
    @PositiveOrZero(message = "Le prix doit être positif ou nul") 
    double prix
) {}

enum Reference {
    _10x15MAT,
    _10x13BRIL, 
    _CALA4BRIL, 
    _CADA3MAT
}

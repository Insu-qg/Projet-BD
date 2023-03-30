package fr.uga.l3miage.photonum.catalogue;

import fr.uga.l3miage.photonum.data.domain.FormatQual;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;



public record CatalogueDTO(
    Long idCatalogue,
    @NotEmpty
    String typeImpr,
    @DecimalMin(value = "0.00")
    Double prixParPhoto,
    @NotNull
    FormatQual referenceImpr
    
) {
    
}

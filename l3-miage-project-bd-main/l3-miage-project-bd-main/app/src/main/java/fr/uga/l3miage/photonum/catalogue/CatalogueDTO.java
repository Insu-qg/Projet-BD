package fr.uga.l3miage.photonum.catalogue;

import fr.uga.l3miage.photonum.data.domain.FormatQual;



public record CatalogueDTO(
    Long idCatalogue,
    String typeImpr,
    Double prixParPhoto,
    FormatQual referenceImpr
    


) {
    
}

package fr.uga.l3miage.photonum.cadre;


import java.util.List;

import fr.uga.l3miage.photonum.photo.PhotoDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CadreDTO(
   @NotBlank(message = "La mise en forme ne peut pas être vide")
   @Size(max = 50, message = "La mise en forme doit avoir une longueur maximale de 50 caractères")
   String miseEnForme,

   @NotNull(message = "La liste de photos ne peut pas être nulle")
   List<PhotoDTO> photoDecadre
) {}

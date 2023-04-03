package fr.uga.l3miage.photonum.calendrier;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.List;

import fr.uga.l3miage.photonum.page.PageDTO;

public record CalendrierDTO(
   @Min(value = 1900, message = "L'année doit être supérieure à 1900")
   @Max(value = 2100, message = "L'année doit être inférieure à 2100")
   int year,

   @NotNull(message = "La liste de pages ne peut pas être nulle")
   List<PageDTO> pages
) {}

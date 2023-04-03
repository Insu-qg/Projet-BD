package fr.uga.l3miage.photonum.album;

import java.util.List;

import org.hibernate.validator.constraints.Length;

import fr.uga.l3miage.photonum.page.PageDTO;
import fr.uga.l3miage.photonum.photo.PhotoDTO;
import jakarta.validation.constraints.NotBlank;

public record AlbumDTO(
    @NotBlank @Length(min=2, max=50)String titreCouverture,
    List<PageDTO> pages,
    PhotoDTO photoCouverture
) {}

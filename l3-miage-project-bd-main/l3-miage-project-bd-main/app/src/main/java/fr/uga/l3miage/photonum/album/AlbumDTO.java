package fr.uga.l3miage.photonum.album;

import fr.uga.l3miage.photonum.data.domain.Photo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import fr.uga.l3miage.photonum.data.domain.Page;

import java.util.Set;

public record AlbumDTO (
    @NotBlank
    String titreCouverture,
    @NotNull
    Photo photoAlbum,
    @NotEmpty
    Set<Page> pagesAlbum
) {
    
}

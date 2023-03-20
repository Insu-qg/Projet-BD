package fr.uga.l3miage.photonum.album;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.data.domain.Page;

import java.util.Set;

public record AlbumDTO (
    String titreCouverture,
    Photo photoAlbum,
    Set<Page> pagesAlbum
) {
    
}

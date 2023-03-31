package fr.uga.l3miage.photonum.album;

import fr.uga.l3miage.photonum.page.PageDTO;
import fr.uga.l3miage.photonum.photo.PhotoDTO;
import java.util.Collection;

public record AlbumDTO (
    String titreCouverture,
    PhotoDTO photo,
    
    Collection<PageDTO> pages
) {
    
}

package fr.uga.l3miage.photonum.page;

import fr.uga.l3miage.photonum.photo.PhotoDTO;
import java.util.Set;

public record PageDTO(
    Long idPage, 
    Long numero,
    Set<PhotoDTO> photos
    

) {}
    

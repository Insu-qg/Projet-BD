package fr.uga.l3miage.photonum.commande;

import java.sql.Date;
import org.springframework.format.annotation.DateTimeFormat;

public record CommandeDTO (
    Long idCommande,
    @DateTimeFormat
    Date dateCommande

) {
    
}

package fr.uga.l3miage.photonum.calendrier;

import fr.uga.l3miage.photonum.data.domain.Calendrier;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface CalendrierMapper {
    CalendrierDTO entityToDTO(Object saved);

    Collection<CalendrierDTO> entityToDTO(Iterable<Calendrier> calendriers);

    Calendrier dtoToEntity(CalendrierDTO calendrier);

    Collection<Calendrier> dtoToEntity(Iterable<CalendrierDTO> calendriers);
}
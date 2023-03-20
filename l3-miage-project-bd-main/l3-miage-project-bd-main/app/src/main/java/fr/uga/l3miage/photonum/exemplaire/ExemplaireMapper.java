package fr.uga.l3miage.photonum.exemplaire;

import fr.uga.l3miage.photonum.data.domain.Exemplaire;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface ExemplaireMapper {
    ExemplaireDTO entityToDTO(Exemplaire exemplaire);

    Collection<ExemplaireDTO> entityToDTO(Iterable<Exemplaire> exemplaires);

    Exemplaire dtoToEntity(ExemplaireDTO exemplaire);

    Collection<Exemplaire> dtoToEntity(Iterable<ExemplaireDTO> exemplaires);
}
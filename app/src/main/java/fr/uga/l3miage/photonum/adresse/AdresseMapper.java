package fr.uga.l3miage.photonum.adresse;

import java.util.List;

import org.mapstruct.Mapper;


import fr.uga.l3miage.photonum.data.domain.Adresse;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    Adresse dtoToEntity(AdresseDTO adresseDTO);
    AdresseDTO entityToDto(Adresse adresse);
    List<Adresse> dtoToEntity(List<AdresseDTO> adresseDTOList);
    List<AdresseDTO> entityToDto(List<Adresse> adresseList);
}

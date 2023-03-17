package fr.uga.l3miage.photonum.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="FormatQual")
public enum FormatQual {
    // on met un _ avant car sinon les 2 premieres valeur donnes une erreur
    _10x15MAT,
    _10x13BRIL,
    _CALA4BRIL,
    _CADA3MAT
}

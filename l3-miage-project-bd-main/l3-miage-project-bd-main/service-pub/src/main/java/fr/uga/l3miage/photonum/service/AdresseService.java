package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface AdresseService extends BaseService<Adresse, Long>{
    /**
     * Saves an adresse object
     *
     * @param adresse to be saved
     * @return the adresse with an id
     */
    Adresse save(Long idClient, Adresse adresse);

    /**
     * Deletes an adresse
     *
     * @param id id of the adresse to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteException   when an album has books that are co-authored
     */
    void delete(Long id) throws EntityNotFoundException, DeleteException;
}

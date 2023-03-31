package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Tirage;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface TirageService extends BaseService<Tirage, Long> {

    /**
     * Saves an Tirage object
     *
     * @param tirage to be saved
     * @return the tirage with an id
     */
    Tirage save(Long idClient, Tirage tirage) throws EntityNotFoundException;

    /**
     * Deletes a tirage
     *
     * @param id id of the tirage to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteTirageException   when an author has books that are co-authored
     */
    void delete(Long id) throws EntityNotFoundException, DeleteTirageException;

}
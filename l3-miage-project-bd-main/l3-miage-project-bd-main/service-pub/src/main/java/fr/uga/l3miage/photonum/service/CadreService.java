package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Cadre;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface CadreService extends BaseService<Cadre, Long> {
    /**
     * Saves an cadre object
     *
     * @param cadre to be saved
     * @return the cadre with an id
     */
    Cadre save(Long idClient,Cadre cadre) throws EntityNotFoundException;

    /**
     * Deletes an cadre
     *
     * @param id id of the album to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteException   
     */
    void delete(Long id) throws EntityNotFoundException, DeleteException;
}

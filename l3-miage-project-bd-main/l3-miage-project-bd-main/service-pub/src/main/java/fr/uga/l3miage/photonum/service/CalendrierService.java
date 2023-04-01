package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Calendrier;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface CalendrierService extends BaseService<Calendrier, Long> {
    /**
     * Saves an album object
     *
     * @param calendrier to be saved
     * @return the calendrier with an id
     */
    Calendrier save(Long idClient,Calendrier calendrier) throws EntityNotFoundException;

    /**
     * Deletes an album
     *
     * @param id id of the calendrier to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteException   
     */
    void delete(Long id) throws EntityNotFoundException, DeleteException;
}

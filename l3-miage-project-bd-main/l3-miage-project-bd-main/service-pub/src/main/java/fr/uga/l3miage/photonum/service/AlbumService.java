package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Album;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface AlbumService extends BaseService<Album, Long> {
    /**
     * Saves an album object
     *
     * @param album to be saved
     * @return the album with an id
     */
    Album save(Long idClient,Album album) throws EntityNotFoundException;

    /**
     * Deletes an album
     *
     * @param id id of the album to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteException   when an album has books that are co-authored
     */
    void delete(Long id) throws EntityNotFoundException, DeleteException;

}

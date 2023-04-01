package fr.uga.l3miage.photonum.service;

import java.util.Collection;

import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface PhotoService extends BaseService<Photo, Long> {
    
    Photo save(Long idClient,Photo photo);
    /**
     * Get all books for a given author
     *
     * @param id the client id
     * @return all photo belonging the client
     * @throws EntityNotFoundException if the client do not exist
     */
    Collection<Photo> getByClientId(Long idClient) throws EntityNotFoundException;
    
    void delete(Long idImage) throws EntityNotFoundException, DeleteException;
}

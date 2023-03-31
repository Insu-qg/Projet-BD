package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.service.base.BaseService;

import java.util.Collection;

public interface ClientService extends BaseService<Client, Long> {

    /**
     * Saves an author object
     *
     * @param client to be saved
     * @return the client with an id
     */
    Client save(Client client);

    /**
     * Search an author by name ignoring case
     *
     * @param name partial or complete name of the author
     * @return found authors
     */
    Collection<Client> searchByName(String name);

    /**
     * Deletes an author
     *
     * @param id id of the author to delete
     * @throws EntityNotFoundException when the entity do not already exists
     * @throws DeleteAuthorException   when an author has books that are co-authored
     */
    void delete(Long id) throws EntityNotFoundException, DeleteException;

}
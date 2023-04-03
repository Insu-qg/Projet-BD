package fr.uga.l3miage.photonum.data.repo;

import fr.uga.l3miage.photonum.data.domain.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository implements CRUDRepository<Long, Client> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Client save(Client client) {
        entityManager.persist(client);
        return client;
    }

    @Override
    public Client get(Long id) {
        return entityManager.find(Client.class, id);
    }


    @Override
    public void delete(Client client) {
        entityManager.remove(client);
    }


    @Override
    public List<Client> all() {
        return null;
    }

    
}

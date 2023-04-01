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
        String jpql = "SELECT a FROM Client a ORDER BY a.nom";
        List<Client> clients = entityManager.createQuery(jpql, Client.class).getResultList();
        return clients;
    }

    /**
     * Recherche un client par son nom par nom (ou partie du nom) de façon insensible à la
     * casse.
     *
     * @param namePart tout ou partie du nomde l'auteur
     * @return une liste de client trié par nom
     */
    public List<Client> searchByName(String namePart) {
        String query = "SELECT c FROM Client c WHERE LOWER(c.nom) LIKE LOWER(:namePart) ORDER BY c.nom";
        TypedQuery<Client> typedQuery = entityManager.createQuery(query, Client.class);
        typedQuery.setParameter("namePart", "%" + namePart + "%");
        return typedQuery.getResultList();
    }
    
}

package fr.uga.l3miage.photonum.data.repo;

import fr.uga.l3miage.photonum.data.domain.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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
     * Recherche un auteur par nom (ou partie du nom) de façon insensible à la
     * casse.
     *
     * @param namePart tout ou partie du nomde l'auteur
     * @return une liste d'auteurs trié par nom
     */
    public List<Client> searchByName(String namePart) {
        String jpql = "SELECT a FROM Client a WHERE LOWER(a.nom) LIKE LOWER(:namePart) ORDER BY a.nom";
        List<Client> clients = entityManager.createQuery(jpql, Client.class)
                .setParameter("namePart", "%" + namePart.toLowerCase() + "%").getResultList();
        return clients;
    }
}

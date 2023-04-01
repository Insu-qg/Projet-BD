package fr.uga.l3miage.photonum.data.repo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Commande;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

public class CommandeRepository implements CRUDRepository<Long, Commande>{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public CommandeRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public Commande save(Commande commande) {
        entityManager.persist(commande);
        return commande;
    }

    @Override
    public Commande get(Long id) {
        return entityManager.find(Commande.class, id);
    } 
    @Override
    public void delete(Commande commande) {
        entityManager.remove(commande);
    }
    // recuperer toutes les commande du système peut importe le client
    @Override
    public List<Commande> all() {
        return entityManager.createQuery("SELECT c FROM Commande c ORDER BY c.dateCommande ASC", Commande.class)
                             .getResultList();
    }

    //recuperer une commande spécifique du client 
    public Commande commandesByClient(Long idClient, Long idCommande) {
        String queryString = "SELECT c FROM Commande JOIN c.client cc WHERE cc.idClient = :clientId AND c.idCommande = :commandeId";
        TypedQuery<Commande> query = entityManager.createQuery(queryString, Commande.class);
        query.setParameter("clientId", idClient);
        query.setParameter("commandeId", idCommande);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    

    // recuperer toutes les commande d'un client spécifique
    public List<Commande> allByClient(Long idClient) {
        return entityManager.createQuery("SELECT c FROM Commande cJOIN c.client cc WHERE cc.idClient = :idClient ORDER BY c.dateCommande ASC", Commande.class)
                             .setParameter("idClient", idClient)
                             .getResultList();
    }
    
    


    
}

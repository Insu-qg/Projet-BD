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
        return null;
    }

    
    
    


    
}

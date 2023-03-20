package fr.uga.l3miage.photonum.data.repo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Commande;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

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

    @Override
    public List<Commande> all() {
        return entityManager.createQuery("from Commande c order by c.dateCommande",Commande.class).getResultList();
       
    }
    
}
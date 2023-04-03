package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Adresse;
import jakarta.persistence.EntityManager;

public class AdresseRepository implements CRUDRepository<Long, Adresse>{
    
    private EntityManager entityManager;
    @Autowired
    public AdresseRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public Adresse save(Adresse adresse) {
        entityManager.persist(adresse);
        return adresse;
    }

    @Override
    public Adresse get(Long id) {
        return entityManager.find(Adresse.class, id);
    }

    @Override
    public void delete(Adresse adresse) {
        entityManager.remove(adresse);
    }
    
    /**
     * Renvoie toutes les adresses
     *
     * @return une liste d'adresses trié par la ville
     */
    @Override
    public List<Adresse> all() {
        return null;
    }
}

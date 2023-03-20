package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Tirage;
import jakarta.persistence.EntityManager;

public class TirageRepository implements CRUDRepository<Long,Tirage> {

    private final EntityManager entityManager;

    @Autowired
    public TirageRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Tirage save(Tirage tirage) {
        entityManager.persist(tirage);
        return tirage;
    }

    @Override
    public Tirage get(Long id) {
        return entityManager.find(Tirage.class, id);
    }

    @Override
    public void delete(Tirage tirage) {
        entityManager.remove(tirage);
    }

    @Override
    public List<Tirage> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }
    @Override
    public Tirage get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
    
}

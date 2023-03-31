package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Cadre;
import jakarta.persistence.EntityManager;

public class CadreRepository implements CRUDRepository<Long,Cadre> {

    private final EntityManager entityManager;

    @Autowired
    public CadreRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Cadre save(Cadre cadre) {
        entityManager.persist(cadre);
        return cadre;
    }

    @Override
    public Cadre get(Long id) {
        return entityManager.find(Cadre.class, id);
    }

    @Override
    public void delete(Cadre cadre) {
        entityManager.remove(cadre);
    }

    @Override
    public List<Cadre> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }
    
}
package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import fr.uga.l3miage.photonum.data.domain.Calendrier;
import jakarta.persistence.EntityManager;

public class CalendrierRepository implements CRUDRepository<Long,Calendrier> {

    private final EntityManager entityManager;

    @Autowired
    public CalendrierRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Calendrier save(Calendrier calendrier) {
        entityManager.persist(calendrier);
        return calendrier;
    }

    @Override
    public Calendrier get(Long id) {
        return entityManager.find(Calendrier.class, id);
    }

    @Override
    public void delete(Calendrier calendrier) {
        entityManager.remove(calendrier);
    }
    //recupere tous les calendrier
@Override
public List<Calendrier> all() {
    return null;
}


}
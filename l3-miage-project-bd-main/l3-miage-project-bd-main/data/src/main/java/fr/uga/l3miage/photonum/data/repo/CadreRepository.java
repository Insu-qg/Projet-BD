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
    // retourne tous les cadre du système
    @Override
    public List<Cadre> all() {
        return entityManager.createQuery("select a from Cadre c ", Cadre.class).getResultList();
    }

    // recuperations de tous les cadre d'un client spécifique
    public List<Cadre> allByClient(Long idClient) {
        return entityManager.createQuery("select c from Cadre c join c.client cl where cl.idClient = :idClient", Cadre.class)
            .setParameter("idClient", idClient)
            .getResultList();
    }
    
}
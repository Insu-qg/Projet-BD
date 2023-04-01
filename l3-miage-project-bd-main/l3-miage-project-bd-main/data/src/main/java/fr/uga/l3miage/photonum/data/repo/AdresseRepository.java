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
        return entityManager.createQuery("select a from Adresse a order by a.ville", Adresse.class).getResultList();
    }

    //recuperer toutes les adresse d'un client spécfique
    //recuperer toutes les adresses d'un client spécifique
    public List<Adresse> allByClient(Long idClient) {
        return entityManager.createQuery("SELECT a FROM Adresse a JOIN a.client ac  WHERE ac.idClient = :idClient ORDER BY a.ville", Adresse.class)
            .setParameter("idClient", idClient)
            .getResultList();
    }
}

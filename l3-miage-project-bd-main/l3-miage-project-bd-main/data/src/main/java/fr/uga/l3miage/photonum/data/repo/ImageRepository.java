package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Image;
import jakarta.persistence.EntityManager;

public class ImageRepository implements CRUDRepository<Long,Image> {
    private EntityManager entityManager;

    @Autowired
    public ImageRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Image save(Image image) {
        entityManager.persist(image);
        return image;
    }

    @Override
    public Image get(Long id) {
        return entityManager.find(Image.class, id);
    }

    @Override
    public void delete(Image image) {
        entityManager.remove(image);
    }

    @Override
    public List<Image> all() {
        return entityManager.createQuery("select i from Image i", Image.class).getResultList();
    }

    public List<Image> allShared() {
        return entityManager.createQuery("select i from Image i where i.isShared = true order by i.id", Image.class).getResultList();
    }

    
    public List<Image> updateImage(Long idImage) {
        if(Boolean.TRUE.equals(this.get(idImage).isShare())){
            return entityManager.createQuery("UPDATE Image i SET i.share = false WHERE i.idImage = :idImage", Image.class).setParameter("idImage", idImage).getResultList();
        }else{
            return entityManager.createQuery("UPDATE Image i SET i.share = true WHERE i.idImage = :image.idImage", Image.class).setParameter("idImage", idImage).getResultList();
        }
        
        
    }

    // Test pour les images d'un client donné
    public List<Image> allImageForClientById(Long id) {
        return entityManager.createQuery("select i from Image i where i.proprietaire.idClient = :id order by i.idImage", Image.class)
        .setParameter("id", id)
        .getResultList();
    }
}

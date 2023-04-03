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
    // on verifie d'abord si une image est utilisé par une photo si oui on ne fait rien sinon on la supprime
    @Override
    public void delete(Image image) {
       //
    }

    @Override
    public List<Image> all() {
        return null;
    }
}

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
    //recuperation de toutes les images de tous les clients
    @Override
    public List<Image> all() {
        return entityManager.createQuery("select i from Image i", Image.class).getResultList();
    }
    //recuperation de toutes les images d'un client'
    public List<Image> allByClient(Long idClient) {
    return entityManager.createQuery("select i from Image i join i.clients c where c.id = :idClient", Image.class)
            .setParameter("idClient", idClient)
            .getResultList();
    }
    //recuperation de toutes les images partagé peut importe le client
    public List<Image> allShared() {
        return entityManager.createQuery("select i from Image i where i.share = true order by i.id", Image.class).getResultList();
    }

    //recuperation de toutes les images partagé par un client spécifique
    public List<Image> allSharedByClientId(Long idClient) {
        return entityManager.createQuery("select i from Image i join i.clients c where i.share = true and c.idClient = :idClient order by i.id", Image.class)
                .setParameter("idClient", idClient)
                .getResultList();
    }
    //mettre a jour une image en la rendant share true si share=false et sinon si share=true on ne fait rien
    public void updateImage(Long idImage) {
        Image imageToUpdate = this.get(idImage);
        if (imageToUpdate != null) {
            if (!imageToUpdate.isShare()) {
                imageToUpdate.setShare(true);
            }
            entityManager.merge(imageToUpdate);
        } else {
            throw new IllegalArgumentException("No image found with the given id");
        }
    }
}

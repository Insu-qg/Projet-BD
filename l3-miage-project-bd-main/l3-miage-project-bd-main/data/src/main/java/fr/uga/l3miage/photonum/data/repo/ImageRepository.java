package fr.uga.l3miage.photonum.data.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.uga.l3miage.photonum.data.domain.Image;
import jakarta.persistence.EntityManager;

public class ImageRepository implements CRUDRepository<Long,Image>{
    
    private final EntityManager entityManager;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }
    
    /*public void update(Image image){
        if(image.getShare()!=true){
            entityManager.createQuery("INSERT " +
            "FROM Librarian l " +
            "JOIN Borrow b ON l.id = b.librarian.id " +
            "GROUP BY l.id " +
            "ORDER BY COUNT(b) DESC", Librarian.class)
        }

    }*/
}

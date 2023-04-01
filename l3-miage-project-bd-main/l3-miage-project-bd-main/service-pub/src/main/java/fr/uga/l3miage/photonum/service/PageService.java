package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Page;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface PageService extends BaseService<Page, Long> {
    
    Page save(Page page);

    void delete(Long id) throws EntityNotFoundException, DeleteException;
}


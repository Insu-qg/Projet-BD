package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Commande;
import fr.uga.l3miage.photonum.service.base.BaseService;

public interface CommandeService extends BaseService<Commande, Long> {

    Commande save(Long clientId, Commande commande) throws EntityNotFoundException;


    void delete (Long idCommande);

}
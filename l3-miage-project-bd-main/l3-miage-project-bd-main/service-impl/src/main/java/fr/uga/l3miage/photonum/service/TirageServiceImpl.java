package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Photo;
import fr.uga.l3miage.photonum.data.domain.Tirage;
import fr.uga.l3miage.photonum.data.repo.TirageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
public class TirageServiceImpl implements TirageService {

    private final TirageRepository tirageRepository;
    private final ClientService clientService;

    @Autowired
    public TirageServiceImpl(TirageRepository tirageRepository, ClientService clientService) {
        this.tirageRepository = tirageRepository;
        this.clientService = clientService;
    }


    @Override
    public Tirage save(Long idClient, Tirage tirage) throws EntityNotFoundException {
        tirageRepository.save(tirage);
        bind(idClient, tirage);
        return tirage;
    }

    @Override
    public Tirage get(Long id) throws EntityNotFoundException {
        return tirageRepository.get(id);
    }

    @Override
    public Collection<Tirage> list() {
        return tirageRepository.all();
    }

    @Override
    public Tirage update(Tirage tirage) throws EntityNotFoundException {
        return tirageRepository.save(tirage);
    }

    private void bind(Long idClient, Tirage tirage) throws EntityNotFoundException {
        Client client = clientService.get(idClient);
        client.addImpression(tirage);
        tirage.setClient(client);
    }


    @Override
    public void delete(Long id) throws EntityNotFoundException, DeleteTirageException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    @Override
    public Collection<Tirage> getTiragesByPhoto(Photo photo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTiragesByPhoto'");
    }


    @Override
    public Collection<Tirage> getTiragesByClient(Client client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTiragesByClient'");
    }
}

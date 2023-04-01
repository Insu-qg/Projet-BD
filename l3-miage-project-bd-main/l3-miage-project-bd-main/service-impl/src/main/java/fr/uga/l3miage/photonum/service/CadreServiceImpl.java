package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Cadre;
import fr.uga.l3miage.photonum.data.repo.CadreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
public class CadreServiceImpl implements CadreService {

    private final CadreRepository cadreRepository;
    private final ClientService clientService;

    @Autowired
    public CadreServiceImpl(CadreRepository cadreRepository, ClientService clientService) {
        this.cadreRepository = cadreRepository;
        this.clientService = clientService;
    }


    @Override
    public Cadre save(Long idClient, Cadre cadre) throws EntityNotFoundException {
        cadreRepository.save(cadre);
        bind(idClient, cadre);
        return cadre;
    }

    @Override
    public Cadre get(Long id) throws EntityNotFoundException {
        return cadreRepository.get(id);
    }

    @Override
    public Collection<Cadre> list() {
        return cadreRepository.all();
    }

    @Override
    public Cadre update(Cadre cadre) throws EntityNotFoundException {
        return cadreRepository.save(cadre);
    }

    private void bind(Long idClient, Cadre cadre) throws EntityNotFoundException {
        Client client = clientService.get(idClient);
        client.addImpression(cadre);
        cadre.setClient(client);
    }


    @Override
    public void delete(Long id) throws EntityNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}

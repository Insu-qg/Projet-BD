package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Calendrier;
import fr.uga.l3miage.photonum.data.repo.CalendrierRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
public class CalendrierServiceImpl implements CalendrierService {

    private final CalendrierRepository calendrierRepository;
    private final ClientService clientService;

    @Autowired
    public CalendrierServiceImpl(CalendrierRepository calendrierRepository, ClientService clientService) {
        this.calendrierRepository = calendrierRepository;
        this.clientService = clientService;
    }


    @Override
    public Calendrier save(Long idClient, Calendrier calendrier) throws EntityNotFoundException {
        calendrierRepository.save(calendrier);
        bind(idClient, calendrier);
        return calendrier;
    }

    @Override
    public Calendrier get(Long id) throws EntityNotFoundException {
        return calendrierRepository.get(id);
    }

    @Override
    public Collection<Calendrier> list() {
        return calendrierRepository.all();
    }

    @Override
    public Calendrier update(Calendrier calendrier) throws EntityNotFoundException {
        return calendrierRepository.save(calendrier);
    }

    private void bind(Long idClient, Calendrier calendrier) throws EntityNotFoundException {
        Client client = clientService.get(idClient);
        client.addImpression(calendrier);
        calendrier.setClient(client);
    }


    @Override
    public void delete(Long id) throws EntityNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}

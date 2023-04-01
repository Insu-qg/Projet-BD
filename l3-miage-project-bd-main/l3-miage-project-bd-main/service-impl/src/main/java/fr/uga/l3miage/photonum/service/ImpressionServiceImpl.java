package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.data.repo.ImpressionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
public class ImpressionServiceImpl implements ImpressionService {

    private final ImpressionRepository impressionRepository;
    private final ClientService clientService;

    @Autowired
    public ImpressionServiceImpl(ImpressionRepository impressionRepository, ClientService clientService) {
        this.impressionRepository = impressionRepository;
        this.clientService = clientService;
    }


    @Override
    public Impression save(Long idClient, Impression impression) throws EntityNotFoundException {
        impressionRepository.save(impression);
        bind(idClient, impression);
        return impression;
    }

    @Override
    public Impression get(Long id) throws EntityNotFoundException {
        return impressionRepository.get(id);
    }

    @Override
    public Collection<Impression> list() {
        return impressionRepository.all();
    }

    @Override
    public Impression update(Impression object) throws EntityNotFoundException {
        return impressionRepository.save(object);
    }

    private void bind(Long idClient, Impression impression) throws EntityNotFoundException {
        Client client = clientService.get(idClient);
        client.addImpression(impression);
        impression.setClient(client);
    }
}

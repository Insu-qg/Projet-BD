package fr.uga.l3miage.photonum.service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Album;
import fr.uga.l3miage.photonum.data.repo.AlbumRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService {

    private final AlbumRepository albumRepository;
    private final ClientService clientService;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepository, ClientService clientService) {
        this.albumRepository = albumRepository;
        this.clientService = clientService;
    }


    @Override
    public Album save(Long idClient, Album album) throws EntityNotFoundException {
        albumRepository.save(album);
        bind(idClient, album);
        return album;
    }

    @Override
    public Album get(Long id) throws EntityNotFoundException {
        return albumRepository.get(id);
    }

    @Override
    public Collection<Album> list() {
        return albumRepository.all();
    }

    @Override
    public Album update(Album album) throws EntityNotFoundException {
        return albumRepository.save(album);
    }

    private void bind(Long idClient, Album album) throws EntityNotFoundException {
        Client client = clientService.get(idClient);
        client.addImpression(album);
        album.setClient(client);
    }


    @Override
    public void delete(Long id) throws EntityNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}

package fr.uga.l3miage.photonum.service;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.repo.ClientRepository;

import java.util.Collection;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Collection<Client> searchByName(String name) {
        return clientRepository.searchByName(name);
    }


    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client get(Long id) throws EntityNotFoundException {
        return clientRepository.get(id);
    }


    @Override
    public Collection<Client> list() {
        return clientRepository.all();
    }

    @Override
    public Client update(Client client) throws EntityNotFoundException {
        return clientRepository.save(client);
    }

    @Override
    public void delete(Long id) throws EntityNotFoundException, DeleteException {
        Client client = get(id);
        if (client == null) {
            throw new EntityNotFoundException("author with id=%d not found".formatted(id));
        }
        /*Set<Book> books = author
                .getBooks();
        if (books != null) {

            Optional<Integer> bookWithManyAuthor = books.stream()
                    .map(Book::getAuthors)
                    .filter(Objects::nonNull)
                    .map(Collection::size)
                    .filter(s -> s > 1)
                    .findFirst();

            if (bookWithManyAuthor.isPresent()) {
                throw new DeleteAuthorException("cannot delete author, one or several books are co-authored");
            }

            for (Book book : books) {
                bookService.delete(book.getId());
            }

        }*/

        clientRepository.delete(client);


    }

}

package fr.uga.l3miage.photonum.client;

import fr.uga.l3miage.photonum.service.ImpressionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import fr.uga.l3miage.photonum.data.domain.Client;
import fr.uga.l3miage.photonum.data.domain.Image;
import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.impression.ImpressionDTO;
import fr.uga.l3miage.photonum.impression.ImpressionMapper;
import fr.uga.l3miage.photonum.service.ClientService;
import fr.uga.l3miage.photonum.service.DeleteException;
import fr.uga.l3miage.photonum.service.EntityNotFoundException;


@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ClientController {
    
    private ClientMapper clientMapper;
    private ClientService clientService;

    private ImpressionMapper impressionMapper;
    private ImpressionService impressionService;



    @Autowired
    public void ClientController(ImpressionMapper impressionMapper, ClientService clientService, ClientMapper clientMapper,ImpressionService impressionService) {
      
      
      this.clientService=clientService;
      this.clientMapper=clientMapper;
      this.impressionMapper=impressionMapper;
       this.impressionService=impressionService;
    }

    @PostMapping("clients")
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDTO newClient(@RequestBody ClientDTO client) { 
        try{
            if(client==null || client.nom()==null||client.prenom()==null){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
        
        Client client1=clientMapper.dtoToEntity(client);
        Client newClient=clientService.save(client1);
            ClientDTO clientDTO=clientMapper.entityToDTO(newClient);
            return clientDTO;

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
   }

   @PutMapping("clients/{id}")
   public void updateClient(@RequestBody ClientDTO  client, @PathVariable("id") Long id) throws EntityNotFoundException {
    if(client.idClient()==id){
        Client clientEntity=clientMapper.dtoToEntity(client);
        Client clientUpdated=clientService.update(clientEntity);
        clientMapper.entityToDTO(clientUpdated);
    }
    else{
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
    }
 }

void imagePartagers(Image image) throws EntityNotFoundException{

if(image.isShare()==false){
  Client client=image.getProprietaire();
  try {
    clientService.delete(client.getIdClient());
} catch (DeleteException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
   image.setShare(true);
}


}


@GetMapping("clients/id/albums")
public List<ImpressionDTO> impressions(@PathVariable("id") Long id) throws EntityNotFoundException{
    Client client = clientService.get(id);
    List<Impression> impressions = (List<Impression>) client.getImpressions();
    return impressions.stream()
                        .map(impressionMapper::entityToDTO)
                        .toList();
 }
}
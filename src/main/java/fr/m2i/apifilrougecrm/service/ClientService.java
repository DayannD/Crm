package fr.m2i.apifilrougecrm.service;

import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public void createClient(Client client){
        clientRepository.save(client);
    }

    public Client getClient(Long id){
        return clientRepository.findById(id).get();
    }

    public Client updateClient(Client client){
        return clientRepository.save(client);
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }
}

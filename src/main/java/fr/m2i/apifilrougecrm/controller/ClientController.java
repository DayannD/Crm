package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.repository.ClientRepository;
import fr.m2i.apifilrougecrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("")
    public List<Client> getClients() {
        return clientService.findAll();
    }

    @PostMapping("")
    public void createClient(@RequestBody Client client) {
        clientService.createClient(client);
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id){
        return clientService.getClient(id);
    }

    @PutMapping("/{id}")
    public void updateClient(@RequestBody Client client){
        clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }
}

package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.repository.ClientRepository;
import fr.m2i.apifilrougecrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;


    @GetMapping("/clients")
    public List<Client> getClient(){
        return clientService.findAll();
    }

    @PostMapping("/clients")
    public void createClient(@RequestBody Client client){
        clientService.createClient(client);
    }
}

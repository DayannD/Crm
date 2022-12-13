package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.dto.ClientDto;
import fr.m2i.apifilrougecrm.dto.ClientMapper;
import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.repository.ClientRepository;
import fr.m2i.apifilrougecrm.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public List<ClientDto> getClients() {
        List<Client> clients = clientService.findAll();
        List<ClientDto> clientDtos = new ArrayList<>();
        for (Client client:
             clients) {
            ClientDto clientDto = ClientMapper.buildClientDto(client);
            clientDtos.add(clientDto);
        }
        return clientDtos;
    }

    @PostMapping("")
    public void createClient(@RequestBody ClientDto clientDto) {
        Client client = ClientMapper.buildClient(clientDto);
        clientService.createClient(client);
    }

    @GetMapping("/{id}")
    public ClientDto getClient(@PathVariable Long id){
        Client client = clientService.getClient(id);
        ClientDto clientDto = ClientMapper.buildClientDto(client);
        return clientDto;
    }

    @PutMapping("/{id}")
    public ClientDto updateClient(@RequestBody ClientDto clientDto){
        Client client = ClientMapper.buildClient(clientDto);
        clientDto = ClientMapper.buildClientDto(clientService.updateClient(client));
        return clientDto;
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }
}

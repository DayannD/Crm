package fr.m2i.apifilrougecrm.dto;

import fr.m2i.apifilrougecrm.entity.Client;

public class ClientMapper {

    public static ClientDto buildClientDto(Client client){

        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setCompanyName(client.getCompanyName());
        clientDto.setFirstName(client.getFirstName());
        clientDto.setLastName(client.getLastName());
        clientDto.setEmail(client.getEmail());
        clientDto.setTelephone(client.getTelephone());//attention
        clientDto.setAddress(client.getAddress());
        clientDto.setZipCode(client.getZipCode());
        clientDto.setCountry(client.getCountry());
        clientDto.setCity(client.getCity());

        switch (client.getState()){
            case 0:
                clientDto.setState("INACTIVE");
                break;
            case 1:
                clientDto.setState("ACTIVE");
                break;
            default:
                clientDto.setState("");
                break;
        }

        return clientDto;
    }

    public static Client buildClient(ClientDto clientDto){

        Client client = new Client();
        client.setId(clientDto.getId());
        client.setCompanyName(clientDto.getCompanyName());
        client.setFirstName(clientDto.getFirstName());
        client.setLastName(clientDto.getLastName());
        client.setEmail(clientDto.getEmail());
        client.setTelephone(clientDto.getTelephone());//attention
        client.setAddress(clientDto.getAddress());
        client.setZipCode(clientDto.getZipCode());
        client.setCountry(clientDto.getCountry());
        client.setCity(clientDto.getCity());

        switch (clientDto.getState()){
            case "INACTIVE":
                client.setState(0);
                break;
            case "ACTIVE":
                client.setState(1);
                break;
            default:
                client.setState(0);
                break;
        }

        return client;
    }
}

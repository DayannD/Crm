package fr.m2i.apifilrougecrm.dto;

import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.entity.Order;

public class OrderMapper {

    public static OrderDto buildeOrderDto(Order order){
        OrderDto orderDto = new OrderDto();

        orderDto.setId(order.getId());
        orderDto.setTypePresta(order.getTypePresta());
        orderDto.setDesignation(order.getDesignation());
        orderDto.setNbDays(order.getNbDays());
        orderDto.setUnitPrice(order.getUnitPrice());

        ClientDto clientDto = ClientMapper.buildClientDto(order.getClient());
        orderDto.setClient(clientDto);

        switch (order.getState()){
            case 0:
                orderDto.setState("CANCELED");
                break;
            case 1:
                orderDto.setState("OPTION");
                break;
            case 2:
                orderDto.setState("CONFIRMED");
                break;
            default:
                orderDto.setState("");
                break;
        }

        return orderDto;
    }

    public static Order buildeOrder(OrderDto orderDto,Client client){

        Order order = new Order();

        order.setId(orderDto.getId());
        order.setTypePersta(orderDto.getTypePresta());
        order.setDesignation(orderDto.getDesignation());
        order.setNbDays(orderDto.getNbDays());
        order.setUnitPrice(orderDto.getUnitPrice());
        order.setClient(client);

        switch (orderDto.getState()){
            case "CANCELED":
                order.setState(0);
                break;
            case "OPTION":
                order.setState(1);
                break;
            case "CONFIRMED":
                order.setState(2);
                break;
            default:
                order.setState(0);
                break;
        }

        return order;
    }
}

package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.dto.ClientMapper;
import fr.m2i.apifilrougecrm.dto.OrderDto;
import fr.m2i.apifilrougecrm.dto.OrderMapper;
import fr.m2i.apifilrougecrm.entity.Client;
import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.service.ClientService;
import fr.m2i.apifilrougecrm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public List<OrderDto> getOrders() {

        List<Order> orders = orderService.getOrders();
        List<OrderDto> orderDtos = new ArrayList<>();

        for (Order order:
             orders) {
            OrderDto orderDto = OrderMapper.buildeOrderDto(order);
            orderDtos.add(orderDto);
        }
        return orderDtos;
    }

    @PostMapping("")
    public void createOrder(@RequestBody OrderDto orderDto) {

        Long id = Long.parseLong(orderDto.getOrderClient_id());
        System.out.println("test1");
        Client client = clientService.getClient(id);
        System.out.println("test2");
        Order order = OrderMapper.buildeOrder(orderDto,client);
        System.out.println("test3");
        orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public OrderDto getOrder(@PathVariable("id") Long id) {
        Order order = orderService.getOrder(id);
        OrderDto orderDto = OrderMapper.buildeOrderDto(order);
        return orderDto;
    }

    @PutMapping("/{id}")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        Client client = clientService.getClient(Long.parseLong(orderDto.getOrderClient_id()));
        Order order = OrderMapper.buildeOrder(orderDto,client);
        orderDto = OrderMapper.buildeOrderDto(orderService.updateOrder(order));
        return orderDto;
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        orderService.deleteOrder(id);
    }
}

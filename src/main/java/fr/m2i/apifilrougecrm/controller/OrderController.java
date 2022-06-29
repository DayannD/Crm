package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/orders")
    public List<Order> getOrders(){

       return orderService.getOrders();
    }

    @PostMapping("/orders")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }
}

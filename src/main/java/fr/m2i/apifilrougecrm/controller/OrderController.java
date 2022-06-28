package fr.m2i.apifilrougecrm.controller;

import fr.m2i.apifilrougecrm.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<Order> getOrders(){

        ArrayList<Order> result = new ArrayList<>();
        result.add(new Order("formation","formation SpringBoot", 2, 50F));
        result.add(new Order("formation","formation SpringBoot avancé", 2, 50F));

        return result;
    }
}
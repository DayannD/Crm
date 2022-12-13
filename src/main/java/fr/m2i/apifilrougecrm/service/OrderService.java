package fr.m2i.apifilrougecrm.service;

import fr.m2i.apifilrougecrm.entity.Order;
import fr.m2i.apifilrougecrm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public void createOrder(Order order){
        orderRepository.save(order);
    }

    public Order getOrder(Long id){
        return orderRepository.findById(id).get();
    }

    public Order updateOrder(Order order){
       return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}

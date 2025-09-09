package org.homework.service;

import jakarta.ws.rs.NotFoundException;
import org.homework.dto.OrderResponse;
import org.homework.model.Order;
import org.homework.openfeign.ProductClient;
import org.homework.openfeign.UserClient;
import org.homework.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@Service
public class OrderServiceImpl {
    private final OrderRepository orderRepository;
    private final ProductClient productClient;
    private final UserClient userClient;

    public OrderServiceImpl(OrderRepository orderRepository, ProductClient productClient, UserClient userClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
        this.userClient = userClient;
    }

    @Transactional
    public Order createOrder (Order order){
        return orderRepository.save(order);
    }
    public OrderResponse getOrderById(Long id){
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("not found with this :" + id));

        return OrderResponse.builder()
                .orderId(order.getId())
                .user(userClient.getUserById(order.getUserId()))
                .product(productClient.getProductByID(order.getProductId()))
                .quantity(order.getQuantity())
                .build();
    }

}

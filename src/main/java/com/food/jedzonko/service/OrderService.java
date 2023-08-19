package com.food.jedzonko.service;

import com.food.jedzonko.dto.OrderDTO;
import com.food.jedzonko.dto.OrderItemDTO;
import com.food.jedzonko.dto.StatusDTO;
import com.food.jedzonko.entities.*;
import com.food.jedzonko.mapper.OrderItemMapper;
import com.food.jedzonko.mapper.OrderMapper;
import com.food.jedzonko.mapper.StatusMapper;
import com.food.jedzonko.repository.CustomerRepository;
import com.food.jedzonko.repository.OrderRepository;
import com.food.jedzonko.repository.RestaurantRepository;
import com.food.jedzonko.repository.StatusRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final StatusMapper statusMapper;
    private final CustomerRepository customerRepository;
    private final RestaurantRepository restaurantRepository;
    private final OrderItemMapper orderItemMapper;
    private final StatusRepository statusRepository;

    public OrderDTO getOrderById(Integer orderId) {
        OrderEntity orderEntity = orderRepository.findById(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + orderId + " not found"));

        return orderMapper.mapFromEntity(orderEntity);
    }

    public List<OrderDTO> getAllOrdersForRestaurant(Integer restaurantId) {
        List<OrderEntity> orders = orderRepository.findByRestaurantId(restaurantId);
        return orders.stream()
                .map(orderMapper::mapFromEntity)
                .collect(Collectors.toList());
    }

    public OrderDTO updateOrderStatus(Integer orderId, StatusDTO newStatus) {
        OrderEntity orderEntity = orderRepository.findById(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + orderId + " not found"));

        orderEntity.setStatus(statusMapper.mapToEntity(newStatus));

        OrderEntity updatedOrderEntity = orderRepository.save(orderEntity);
        return orderMapper.mapFromEntity(updatedOrderEntity);
    }

    public OrderDTO createOrder(Integer customerId, Integer restaurantId, List<OrderItemDTO> orderItemsDTO) {
        CustomerEntity customerEntity = customerRepository.findById(customerId)
                .orElseThrow(() -> new EntityNotFoundException("Customer with id " + customerId + " not found"));

        RestaurantEntity restaurantEntity = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant with id " + restaurantId + " not found"));

        List<OrderItemEntity> orderItems = orderItemsDTO.stream()
                .map(orderItemMapper::mapToEntity)
                .collect(Collectors.toList());

        OrderEntity newOrderEntity = new OrderEntity();
        newOrderEntity.setCustomer(customerEntity);
        newOrderEntity.setRestaurant(restaurantEntity);
        newOrderEntity.setOrderItems(orderItems);

        OrderEntity savedOrderEntity = orderRepository.save(newOrderEntity);
        return orderMapper.mapFromEntity(savedOrderEntity);
    }

    public OrderDTO cancelOrder(Integer orderId) {
        OrderEntity orderEntity = orderRepository.findById(orderId)
                .orElseThrow(() -> new EntityNotFoundException("Order with id " + orderId + " not found"));

        OffsetDateTime currentTime = OffsetDateTime.now();
        OffsetDateTime orderTime = orderEntity.getOrderTime();

        if (Duration.between(orderTime, currentTime).toMinutes() <= 20) {
            StatusEntity canceledStatus = statusRepository.findByStatusName("Canceled")
                    .orElseThrow(() -> new EntityNotFoundException("Status 'Canceled' not found"));

            orderEntity.setStatus(canceledStatus);
            OrderEntity canceledOrder = orderRepository.save(orderEntity);
            return orderMapper.mapFromEntity(canceledOrder);
        } else {
            throw new IllegalStateException("Order cannot be canceled after 20 minutes.");
        }
    }



    public OrderDTO getCurrentOrderForCustomer(Integer customerId) {
        OrderEntity currentOrder = orderRepository.findCustomerCurrentOrder(customerId);
        return orderMapper.mapFromEntity(currentOrder);
    }


}

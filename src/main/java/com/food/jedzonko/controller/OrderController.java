package com.food.jedzonko.controller;

import com.food.jedzonko.dto.OrderDTO;
import com.food.jedzonko.dto.OrderItemDTO;
import com.food.jedzonko.dto.StatusDTO;
import com.food.jedzonko.mapper.OrderMapper;
import com.food.jedzonko.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/restaurant/{restaurantId}/orders")
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/{orderId}")
    public OrderDTO getOrderById(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }

    @GetMapping
    public List<OrderDTO> getAllOrdersForRestaurant(@PathVariable Integer restaurantId) {
        return orderService.getAllOrdersForRestaurant(restaurantId);
    }

    @PutMapping("/{orderId}/updateStatus")
    public OrderDTO updateOrderStatus(@PathVariable Integer restaurantId,
                                      @PathVariable Integer orderId,
                                      @RequestBody StatusDTO newStatus) {
        return orderService.updateOrderStatus(orderId, newStatus);
    }

    @PostMapping("/createOrder")
    public OrderDTO createOrder(@RequestParam Integer customerId,
                                @RequestParam Integer restaurantId,
                                @RequestBody List<OrderItemDTO> orderItemsDTO) {
        return orderService.createOrder(customerId, restaurantId, orderItemsDTO);
    }

    @PutMapping("/{orderId}/cancel")
    public OrderDTO cancelOrder(@PathVariable Integer orderId) {
        return orderService.cancelOrder(orderId);
    }


    @GetMapping("/customerOrder/{customerId}")
    public OrderDTO getCurrentOrderForCustomer(@PathVariable Integer customerId) {
        return orderService.getCurrentOrderForCustomer(customerId);
    }


}

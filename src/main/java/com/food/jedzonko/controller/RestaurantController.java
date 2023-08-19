package com.food.jedzonko.controller;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.dto.RestaurantDTO;
import com.food.jedzonko.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/restaurant/")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping(value = "/all")
    public List<RestaurantDTO> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{restaurantId}/menu")
    public List<MenuItemDTO> getAllMenuItemsForRestaurant(@PathVariable Integer restaurantId) {
        return restaurantService.getAllMenuItemsForRestaurant(restaurantId);
    }

    @GetMapping("/checkDelivery")
    public List<RestaurantDTO> getRestaurantsByStreet(@RequestParam String streetName) {
        return restaurantService.getRestaurantsByStreet(streetName);
    }

    @GetMapping("/search")
    public List<RestaurantDTO> getRestaurantsByName(@RequestParam String restaurantName) {
        return restaurantService.getRestaurantsByName(restaurantName);
    }
}

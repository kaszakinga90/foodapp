package com.food.jedzonko.service;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.dto.RestaurantDTO;
import com.food.jedzonko.entities.RestaurantEntity;
import com.food.jedzonko.mapper.MenuItemMapper;
import com.food.jedzonko.mapper.RestaurantMapper;
import com.food.jedzonko.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;
    private final MenuItemMapper menuItemMapper;

    public List<RestaurantDTO> getAllRestaurants() {
        List<RestaurantEntity> restaurants = restaurantRepository.findAll();
        return restaurants.stream()
                .map(restaurantMapper::mapFromEntity)
                .collect(Collectors.toList());
    }


    public List<MenuItemDTO> getAllMenuItemsForRestaurant(Integer restaurantId) {
        RestaurantEntity restaurantEntity = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant with id " + restaurantId + " not found"));

        return restaurantEntity.getMenu().stream()
                .map(menuItemMapper::mapFromEntity)
                .collect(Collectors.toList());
    }

    public List<RestaurantDTO> getRestaurantsByStreet(String streetName) {
        List<RestaurantEntity> restaurants = restaurantRepository.findByDeliveryStreetName(streetName);
        return restaurants.stream()
                .map(restaurantMapper::mapFromEntity)
                .collect(Collectors.toList());
    }

    public List<RestaurantDTO> getRestaurantsByName(String restaurantName) {
        List<RestaurantEntity> restaurants = restaurantRepository.findByRestaurantName(restaurantName);
        return restaurants.stream()
                .map(restaurantMapper::mapFromEntity)
                .collect(Collectors.toList());
    }
}

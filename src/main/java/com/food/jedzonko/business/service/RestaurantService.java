package com.food.jedzonko.business.service;

import com.food.jedzonko.business.dao.RestaurantDAO;
import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class RestaurantService {

    private final RestaurantDAO restaurantDAO;

    public List<Restaurant> findRestaurants(String streetName){
        List<Restaurant> restaurants = restaurantDAO.findRestaurantsByStreetName(streetName);

        return restaurants;
    }

    public Optional<Restaurant> findRestaurantByName(String name){
        Optional<Restaurant> restaurants = restaurantDAO.findRestaurantByName(name);

        return restaurants;
    }

    public List<Restaurant> findAllRestaurants() {
        return restaurantDAO.findAllRestaurants();
    }

    public List<MenuItem> findMenuItemsByRestaurantId(Integer restaurantId){
        return restaurantDAO.findMenuItemsByRestaurantId(restaurantId);
    }
}

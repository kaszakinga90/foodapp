package com.food.jedzonko.business.dao;

import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.domain.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantDAO {
    List<Restaurant> findRestaurantsByStreetName(String streetName);
    Optional<Restaurant> findRestaurantByName(String restaurantName);

    List<Restaurant> findAllRestaurants();

    List<MenuItem> findMenuItemsByRestaurantId(Integer restaurantId);
}

package com.food.jedzonko.infrastructure.database.repository.repo;

import com.food.jedzonko.business.dao.RestaurantDAO;
import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.domain.Restaurant;
import com.food.jedzonko.infrastructure.database.repository.jpa.RestaurantJpaRepository;
import com.food.jedzonko.infrastructure.database.repository.mapper.MenuItemEntityMapper;
import com.food.jedzonko.infrastructure.database.repository.mapper.RestaurantEntityMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class RestaurantRepo implements RestaurantDAO {

    private final RestaurantJpaRepository restaurantJpaRepository;
    private final RestaurantEntityMapper restaurantMapper;
    private final MenuItemEntityMapper menuItemMapper;

    @Override
    public List<Restaurant> findRestaurantsByStreetName(String streetName) {
        return restaurantJpaRepository.findRestaurantsByStreetName(streetName).stream()
                .map(restaurantMapper::mapFromEntity)
                .toList();
    }

    @Override
    public Optional<Restaurant> findRestaurantByName(String restaurantName) {
        return restaurantJpaRepository.findRestaurantByName(restaurantName)
                .map(restaurantMapper::mapFromEntity);
    }


    @Override
    public List<Restaurant> findAllRestaurants() {
        return restaurantJpaRepository.findAll().stream()
                .map(restaurantMapper::mapFromEntity)
                .toList();
    }

    @Override
    public List<MenuItem> findMenuItemsByRestaurantId(Integer restaurantId) {
        return restaurantJpaRepository.findMenuItemsByRestaurantId(restaurantId).stream()
                .map(menuItemMapper::mapFromEntity)
                .toList();
    }
}

package com.food.jedzonko.infrastructure.database.repository.jpa;

import com.food.jedzonko.infrastructure.database.entity.MenuItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemJpaRepository extends JpaRepository<MenuItemEntity, Integer> {

    List<MenuItemEntity> findByRestaurant_RestaurantId(Integer restaurantId); // Metoda do pobrania MenuItem dla danej restauracji
}

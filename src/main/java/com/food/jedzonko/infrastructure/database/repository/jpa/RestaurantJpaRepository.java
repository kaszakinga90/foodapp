package com.food.jedzonko.infrastructure.database.repository.jpa;

import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.infrastructure.database.entity.MenuItemEntity;
import com.food.jedzonko.infrastructure.database.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<RestaurantEntity, Integer> {

    @Query("""
            SELECT r FROM RestaurantEntity r
            JOIN r.deliveryStreets ds
            WHERE ds.streetName = :streetName
            """)
    List<RestaurantEntity> findRestaurantsByStreetName(@Param("streetName") String streetName);

    Optional<RestaurantEntity> findRestaurantByName(String restaurantName);

    List<RestaurantEntity> findAll();

    @Query("SELECT DISTINCT mi FROM MenuItemEntity mi " +
            "WHERE mi.restaurant.restaurantId = :restaurantId")
    List<MenuItemEntity> findMenuItemsByRestaurantId(@Param("restaurantId") Integer restaurantId);
}

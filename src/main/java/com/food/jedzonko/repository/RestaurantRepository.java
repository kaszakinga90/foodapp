package com.food.jedzonko.repository;

import com.food.jedzonko.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {

    @Query("SELECT DISTINCT r FROM RestaurantEntity r JOIN r.deliveryStreets s WHERE s.streetName = :streetName")
    List<RestaurantEntity> findByDeliveryStreetName(@Param("streetName") String streetName);

    @Query("SELECT r FROM RestaurantEntity r WHERE r.restaurantName LIKE %:restaurantName%")
    List<RestaurantEntity> findByRestaurantName(@Param("restaurantName") String restaurantName);
}

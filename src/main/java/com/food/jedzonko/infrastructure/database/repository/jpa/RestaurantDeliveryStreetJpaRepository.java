package com.food.jedzonko.infrastructure.database.repository.jpa;

import com.food.jedzonko.infrastructure.database.entity.RestaurantDeliveryStreetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantDeliveryStreetJpaRepository extends JpaRepository<RestaurantDeliveryStreetEntity, Integer>  {
}

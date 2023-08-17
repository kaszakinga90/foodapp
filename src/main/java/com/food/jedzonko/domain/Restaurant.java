package com.food.jedzonko.domain;

import com.food.jedzonko.infrastructure.database.entity.StreetEntity;
import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "restaurantId")
@ToString(of = {"restaurantId", "owner", "restaurantName"})
public class Restaurant {

    Integer restaurantId;
    RestaurantOwner owner;
    String restaurantName;
    Set<StreetEntity> deliveryStreets;
    Set<MenuItem> menuItems;
    Set<Order> orders;
}

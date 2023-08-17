package com.food.jedzonko.domain;

import com.food.jedzonko.infrastructure.database.entity.RestaurantEntity;
import com.food.jedzonko.infrastructure.database.entity.StreetEntity;
import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "restaurantDeliveryStreetsId")
@ToString(of = {"restaurantDeliveryStreetsId", "restaurant", "street"})
public class RestaurantDeliveryStreets {

    Integer restaurantDeliveryStreetsId;
    RestaurantEntity restaurant;
    StreetEntity street;
}

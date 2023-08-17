package com.food.jedzonko.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "ownerId")
@ToString(of = {"ownerId", "ownerName"})
public class RestaurantOwner {

    Integer ownerId;
    String ownerName;
    Set<Restaurant> restaurants;
}

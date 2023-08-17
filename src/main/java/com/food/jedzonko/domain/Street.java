package com.food.jedzonko.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "streetId")
@ToString(of = {"streetId", "streetName"})
public class Street {

    Integer streetId;
    String streetName;
    Set<Customer> customers;
    Set<Restaurant> restaurants;
}

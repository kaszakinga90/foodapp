package com.food.jedzonko.domain;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderId")
@ToString(of = {"orderId", "customer", "restaurant", "status"})
public class Order {

    Integer orderId;
    Customer customer;
    Restaurant restaurant;
    OffsetDateTime orderTime;
    Status status;
    Set<OrderItem> orderItems;
}

package com.food.jedzonko.domain;

import lombok.*;

@With
@Value
@Builder
@EqualsAndHashCode(of = "orderItemId")
@ToString(of = {"orderItemId", "order", "menuItem", "quantity"})
public class OrderItem {

    Integer orderItemId;
    Order order;
    MenuItem menuItem;
    Integer quantity;
}

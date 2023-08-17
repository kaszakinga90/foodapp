package com.food.jedzonko.domain;

import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "itemId")
@ToString(of = {"itemId", "restaurant", "category", "itemName", "description"})
public class MenuItem {

    Integer itemId;
    Restaurant restaurant;
    Category category;
    String itemName;
    String description;
    BigDecimal price;
    String itemImageUrl;
    Set<OrderItem> orderItems;
}

package com.food.jedzonko.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "customerId")
@ToString(of = {"customerId", "customerName", "street", "phone"})
public class Customer {

    Integer customerId;
    String customerName;
    Street street;
    String phone;
    Set<Order> orders;
}

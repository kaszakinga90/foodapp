package com.food.jedzonko.domain;

import lombok.*;

import java.util.Set;

@With
@Value
@Builder
@EqualsAndHashCode(of = "statusId")
@ToString(of = {"statusId", "statusName"})
public class Status {

    Integer statusId;
    String statusName;
    Set<Order> orders;
}

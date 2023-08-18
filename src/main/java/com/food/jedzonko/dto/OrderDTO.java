package com.food.jedzonko.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Integer orderId;
    private CustomerDTO customerDto;
    private RestaurantDTO restaurantDto;
    private OffsetDateTime orderTime;
    private StatusDTO statusDto;
    private Set<OrderItemDTO> orderItemsDto;
}

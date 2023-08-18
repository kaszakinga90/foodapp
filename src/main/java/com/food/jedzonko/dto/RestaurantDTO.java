package com.food.jedzonko.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {

    private Integer restaurantId;
    private RestaurantOwnerDTO ownerDto;
    private String restaurantName;
    private Set<StreetDTO> deliveryStreetsDto;
    private Set<MenuItemDTO> menuDto;
    private Set<OrderDTO> ordersDto;
}

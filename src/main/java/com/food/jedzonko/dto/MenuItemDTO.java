package com.food.jedzonko.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {

    private Integer itemId;
    private Set<RestaurantDTO> restaurantsDto;
    private CategoryDTO categoryDto;
    private String itemName;
    private String description;
    private BigDecimal price;
    private String itemImageUrl;
    private Set<OrderItemDTO> orderItemsDto;
}

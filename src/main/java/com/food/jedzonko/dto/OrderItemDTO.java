package com.food.jedzonko.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Integer orderItemId;
    private OrderDTO orderDto;
    private MenuItemDTO menuItemDto;
    private Integer quantity;
}

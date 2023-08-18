package com.food.jedzonko.dto;

import com.food.jedzonko.entities.StreetEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private Integer customerId;
    private String customerName;
    private StreetEntity street;
    private String phone;
    private Set<OrderDTO> ordersDto;
}

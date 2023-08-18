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
public class StatusDTO {

    private Integer statusId;
    private String statusName;
    private Set<OrderDTO> ordersDto;
}

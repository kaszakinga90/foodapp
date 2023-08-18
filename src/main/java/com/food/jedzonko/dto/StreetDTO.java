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
public class StreetDTO {

    private Integer streetId;
    private String streetName;
    private Set<CustomerDTO> customersDto;
    private Set<RestaurantDTO> restaurantsDto;
}

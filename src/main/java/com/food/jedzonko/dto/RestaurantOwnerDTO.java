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
public class RestaurantOwnerDTO {

    private Integer ownerId;
    private String ownerName;
    private Set<RestaurantDTO> restaurantsDto;
}

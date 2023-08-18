package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.RestaurantOwnerDTO;
import com.food.jedzonko.entities.RestaurantOwnerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantOwnerMapper {
    @Mapping(target = "restaurantsDto", ignore = true)
    RestaurantOwnerDTO mapFromEntity(RestaurantOwnerEntity entity);

    RestaurantOwnerEntity mapToEntity(RestaurantOwnerDTO restaurantOwnerDTO);
}

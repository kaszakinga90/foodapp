package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.RestaurantDTO;
import com.food.jedzonko.entities.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {
    @Mapping(target = "ownerDto", ignore = true)
    @Mapping(target = "deliveryStreetsDto", ignore = true)
    @Mapping(target = "menuDto", ignore = true)
    @Mapping(target = "ordersDto", ignore = true)
    RestaurantDTO mapFromEntity(RestaurantEntity entity);

    RestaurantEntity mapToEntity(RestaurantDTO restaurantDTO);
}

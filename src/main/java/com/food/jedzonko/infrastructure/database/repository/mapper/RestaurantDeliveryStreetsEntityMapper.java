package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.RestaurantDeliveryStreets;
import com.food.jedzonko.infrastructure.database.entity.RestaurantDeliveryStreetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantDeliveryStreetsEntityMapper {

    @Mapping(target = "restaurant", ignore = true)
    @Mapping(target = "street", ignore = true)
    RestaurantDeliveryStreets mapFromEntity(RestaurantDeliveryStreetEntity entity);
}

package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Restaurant;
import com.food.jedzonko.infrastructure.database.entity.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantEntityMapper {

    @Mapping(target = "owner", ignore = true)
    //@Mapping(target = "deliveryStreets", ignore = true)
    @Mapping(target = "menuItems", ignore = true)
    @Mapping(target = "orders", ignore = true)
    Restaurant mapFromEntity(RestaurantEntity entity);
}

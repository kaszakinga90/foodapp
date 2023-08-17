package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.RestaurantOwner;
import com.food.jedzonko.infrastructure.database.entity.RestaurantOwnerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantOwnerEntityMapper {

    @Mapping(target = "restaurants", ignore = true)
    RestaurantOwner mapFromEntity(RestaurantOwnerEntity entity);
}

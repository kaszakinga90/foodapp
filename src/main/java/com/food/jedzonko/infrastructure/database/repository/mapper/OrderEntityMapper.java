package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Order;
import com.food.jedzonko.infrastructure.database.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderEntityMapper {

    @Mapping(target = "customer", ignore = true)
    @Mapping(target = "restaurant", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "orderItems", ignore = true)
    Order mapFromEntity(OrderEntity entity);
}

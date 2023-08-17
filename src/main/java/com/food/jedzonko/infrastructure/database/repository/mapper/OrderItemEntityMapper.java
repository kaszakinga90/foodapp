package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.OrderItem;
import com.food.jedzonko.infrastructure.database.entity.OrderItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderItemEntityMapper {

    @Mapping(target = "order", ignore = true)
    @Mapping(target = "menuItem", ignore = true)
    OrderItem mapFromEntity(OrderItemEntity entity);
}

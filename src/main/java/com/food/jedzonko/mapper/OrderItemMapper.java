package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.OrderItemDTO;
import com.food.jedzonko.entities.OrderItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderItemMapper {

    @Mapping(target = "orderDto", ignore = true)
    @Mapping(target = "menuItemDto", ignore = true)
    OrderItemDTO mapFromEntity(OrderItemEntity OrderItemEntity);

    OrderItemEntity mapToEntity(OrderItemDTO orderItemDTO);
}

package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.OrderDTO;
import com.food.jedzonko.entities.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper {
    @Mapping(target = "customerDto", ignore = true)
    @Mapping(target = "restaurantDto", ignore = true)
    @Mapping(target = "statusDto", ignore = true)
    @Mapping(target = "orderItemsDto", ignore = true)
    OrderDTO mapFromEntity(OrderEntity entity);

    OrderEntity mapToEntity(OrderDTO orderDTO);
}

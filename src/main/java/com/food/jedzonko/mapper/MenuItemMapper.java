package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.entities.MenuItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuItemMapper {

    @Mapping(target = "restaurantsDto", ignore = true)
    @Mapping(target = "categoryDto", ignore = true)
    @Mapping(target = "orderItemsDto", ignore = true)
    MenuItemDTO mapFromEntity(MenuItemEntity entity);

    MenuItemEntity mapToEntity(MenuItemDTO menuItemDTO);
}

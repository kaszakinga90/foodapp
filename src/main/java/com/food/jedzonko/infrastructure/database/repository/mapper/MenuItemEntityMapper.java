package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.infrastructure.database.entity.MenuItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuItemEntityMapper {

    @Mapping(target = "restaurant", ignore = true)
    @Mapping(target = "category", ignore = true)
    @Mapping(target = "orderItems", ignore = true)
    MenuItem mapFromEntity(MenuItemEntity entity);

    @Mapping(target = "orderItems", ignore = true)
    MenuItemEntity mapToEntity(MenuItem menuItem);
}

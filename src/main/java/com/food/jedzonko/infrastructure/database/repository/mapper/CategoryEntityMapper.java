package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Category;
import com.food.jedzonko.infrastructure.database.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryEntityMapper {

    @Mapping(target = "menuItems", ignore = true)
    Category mapFromEntity(CategoryEntity entity);
}

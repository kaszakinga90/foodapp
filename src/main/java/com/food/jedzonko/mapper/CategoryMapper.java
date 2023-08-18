package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.CategoryDTO;
import com.food.jedzonko.entities.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "menuItemsDTO", ignore = true)
    CategoryDTO mapFromEntity(CategoryEntity entity);

    CategoryEntity mapToEntity(CategoryDTO categoryDTO);
}

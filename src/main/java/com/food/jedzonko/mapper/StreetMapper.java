package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.StreetDTO;
import com.food.jedzonko.entities.StreetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StreetMapper {

    @Mapping(target = "customersDto", ignore = true)
    @Mapping(target = "restaurantsDto", ignore = true)
    StreetDTO mapFromEntity(StreetEntity entity);

    StreetEntity mapToEntity(StreetDTO streetDTO);
}

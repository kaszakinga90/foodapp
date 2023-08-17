package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Street;
import com.food.jedzonko.infrastructure.database.entity.StreetEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StreetEntityMapper {
    @Mapping(target = "customers", ignore = true)
    @Mapping(target = "restaurants", ignore = true)
    Street mapFromEntity(StreetEntity entity);
}

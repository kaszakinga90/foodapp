package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Status;
import com.food.jedzonko.infrastructure.database.entity.StatusEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusEntityMapper {

    @Mapping(target = "orders", ignore = true)
    Status mapFromEntity(StatusEntity entity);
}

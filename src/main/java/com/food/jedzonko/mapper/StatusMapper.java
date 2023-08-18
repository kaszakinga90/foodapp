package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.StatusDTO;
import com.food.jedzonko.entities.StatusEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusMapper {

    @Mapping(target = "ordersDto", ignore = true)
    StatusDTO mapFromEntity(StatusEntity entity);

    StatusEntity mapToEntity(StatusDTO statusDTO);
}

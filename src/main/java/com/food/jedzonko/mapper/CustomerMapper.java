package com.food.jedzonko.mapper;

import com.food.jedzonko.dto.CustomerDTO;
import com.food.jedzonko.entities.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    @Mapping(target = "street", ignore = true)
    @Mapping(target = "ordersDto", ignore = true)
    CustomerDTO mapFromEntity(CustomerEntity entity);

    CustomerEntity mapToEntity(CustomerDTO customerDTO);
}

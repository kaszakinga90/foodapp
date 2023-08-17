package com.food.jedzonko.infrastructure.database.repository.mapper;

import com.food.jedzonko.domain.Customer;
import com.food.jedzonko.infrastructure.database.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerEntityMapper {

    @Mapping(target = "street", ignore = true)
    @Mapping(target = "orders", ignore = true)
    Customer mapFromEntity(CustomerEntity entity);
}

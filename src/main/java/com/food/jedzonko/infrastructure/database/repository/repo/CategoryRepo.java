package com.food.jedzonko.infrastructure.database.repository.repo;

import com.food.jedzonko.business.dao.CategoryDAO;
import com.food.jedzonko.domain.Category;
import com.food.jedzonko.infrastructure.database.repository.jpa.CategoryJpaRepository;
import com.food.jedzonko.infrastructure.database.repository.mapper.CategoryEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CategoryRepo implements CategoryDAO {

    private final CategoryJpaRepository categoryJpaRepository;
    private final CategoryEntityMapper mapper;

    @Override
    public List<Category> findAll() {
        return categoryJpaRepository.findAll().stream()
                .map(mapper::mapFromEntity)
                .toList();
    }
}

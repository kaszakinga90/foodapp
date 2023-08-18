package com.food.jedzonko.service;

import com.food.jedzonko.entities.CategoryEntity;
import com.food.jedzonko.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<CategoryEntity> getAllCategories(){
        return categoryRepository.findAll();
    }

}

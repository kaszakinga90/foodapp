package com.food.jedzonko.controller;

import com.food.jedzonko.dto.CategoryDTO;
import com.food.jedzonko.mapper.CategoryMapper;
import com.food.jedzonko.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/category")
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping(value = "allCategories")
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories()
                .stream()
                .map(categoryMapper::mapFromEntity)
                .collect(Collectors.toList());

    }
}

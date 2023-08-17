package com.food.jedzonko.business.service;

import com.food.jedzonko.business.dao.CategoryDAO;
import com.food.jedzonko.domain.Category;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryDAO categoryDAO;

    public List<Category> findAll(){
        List<Category> categories = categoryDAO.findAll();
        log.info("Categories: [{}]", categories);
        return categories;
    }
}

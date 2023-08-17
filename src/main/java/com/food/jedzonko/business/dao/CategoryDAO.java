package com.food.jedzonko.business.dao;

import com.food.jedzonko.domain.Category;

import java.util.List;

public interface CategoryDAO {

    List<Category> findAll();
}

package com.food.jedzonko.service;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.entities.CategoryEntity;
import com.food.jedzonko.entities.MenuItemEntity;
import com.food.jedzonko.entities.RestaurantEntity;
import com.food.jedzonko.mapper.MenuItemMapper;
import com.food.jedzonko.repository.CategoryRepository;
import com.food.jedzonko.repository.MenuItemRepository;
import com.food.jedzonko.repository.RestaurantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MenuItemService {

    private final MenuItemRepository menuItemRepository;
    private final MenuItemMapper menuItemMapper;
    private final CategoryRepository categoryRepository;
    private final RestaurantRepository restaurantRepository;

    public MenuItemDTO createMenuItemForRestaurant(Integer restaurantId, MenuItemDTO menuItemDTO) {
        RestaurantEntity restaurantEntity = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant with id " + restaurantId + " not found"));

        CategoryEntity categoryEntity = categoryRepository.findById(menuItemDTO.getCategoryDto().getCategoryId())
                .orElseThrow(() -> new EntityNotFoundException("Category with id " + menuItemDTO.getCategoryDto().getCategoryId() + " not found"));

        MenuItemEntity newMenuItemEntity = menuItemMapper.mapToEntity(menuItemDTO);
        newMenuItemEntity.setCategory(categoryEntity);
        restaurantEntity.getMenu().add(newMenuItemEntity);

        MenuItemEntity savedMenuItemEntity = menuItemRepository.save(newMenuItemEntity);
        return menuItemMapper.mapFromEntity(savedMenuItemEntity);
    }
}

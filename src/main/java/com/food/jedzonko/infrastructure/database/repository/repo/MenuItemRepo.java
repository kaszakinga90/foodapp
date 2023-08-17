package com.food.jedzonko.infrastructure.database.repository.repo;

import com.food.jedzonko.business.dao.MenuItemDAO;
import com.food.jedzonko.domain.MenuItem;
import com.food.jedzonko.infrastructure.database.entity.MenuItemEntity;
import com.food.jedzonko.infrastructure.database.repository.jpa.MenuItemJpaRepository;
import com.food.jedzonko.infrastructure.database.repository.mapper.MenuItemEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MenuItemRepo implements MenuItemDAO {

    private final MenuItemJpaRepository menuItemJpaRepository;
    private final MenuItemEntityMapper menuItemEntityMapper;
    @Override
    public MenuItem addMenuItem(MenuItem menuItem) {
        MenuItemEntity menuItemEntity = menuItemEntityMapper.mapToEntity(menuItem);
        return menuItemEntityMapper.mapFromEntity(menuItemJpaRepository.save(menuItemEntity));
    }

    public List<MenuItem> getMenuItemsByRestaurantId(Integer restaurantId) {
        return menuItemJpaRepository.findByRestaurant_RestaurantId(restaurantId).stream()
                .map(menuItemEntityMapper::mapFromEntity)
                .toList();
    }
}

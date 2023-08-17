package com.food.jedzonko.business.service;

import com.food.jedzonko.business.dao.MenuItemDAO;
import com.food.jedzonko.domain.MenuItem;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MenuItemService {

    private final MenuItemDAO menuItemDAO;

    public MenuItem addMenuItem(MenuItem menuItem) {
        return menuItemDAO.addMenuItem(menuItem);
    }
}

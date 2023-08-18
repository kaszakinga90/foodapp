package com.food.jedzonko.controller;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/restaurant/{restaurantId}/menuItems")
public class MenuItemController {

    private final MenuItemService menuItemService;

    @PostMapping
    public MenuItemDTO createMenuItem(@PathVariable Integer restaurantId,
                                      @RequestBody MenuItemDTO menuItemDTO) {
        return menuItemService.createMenuItemForRestaurant(restaurantId, menuItemDTO);
    }
}

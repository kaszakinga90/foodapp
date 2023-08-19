package com.food.jedzonko.controller;

import com.food.jedzonko.dto.MenuItemDTO;
import com.food.jedzonko.entities.MenuItemEntity;
import com.food.jedzonko.mapper.MenuItemMapper;
import com.food.jedzonko.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/restaurant/{restaurantId}/menuItems")
public class MenuItemController {

    private final MenuItemService menuItemService;
    private final MenuItemMapper menuItemMapper;

    @GetMapping(value = "getMenuItem")
    public MenuItemDTO getMenuItem(@RequestParam Integer id){
        return menuItemMapper.mapFromEntity(menuItemService.getMenuItem(id));
    }

    @GetMapping(value = "getMenu")
    public List<MenuItemDTO> getMenu(){
        List<MenuItemEntity> menu = menuItemService.getMenu();
        return menu.stream()
                .map(menuItemMapper::mapFromEntity)
                .collect(Collectors.toList());
    }

    @PostMapping(value = "newItem")
    public MenuItemDTO createMenuItem(@PathVariable Integer restaurantId,
                                      @RequestBody MenuItemDTO menuItemDTO) {
        return menuItemService.createMenuItemForRestaurant(restaurantId, menuItemDTO);
    }

    @PutMapping(value = "updateItem")
    public MenuItemDTO updateMenuItem(@RequestBody MenuItemDTO menuItemDTO) {
        return menuItemMapper.mapFromEntity(menuItemService.updateMenuItem(
                menuItemDTO.getItemId(),
                menuItemMapper.mapToEntity(menuItemDTO)));
    }

    @DeleteMapping(value = "deleteItem")
    public void deleteItem(@RequestParam Integer id) {
        menuItemService.deleteMenuItem(id);
    }

}

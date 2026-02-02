package com.example.restaurant.controller;

import com.example.restaurant.dao.MenuItemDAO;
import com.example.restaurant.dto.MenuItemRequest;
import com.example.restaurant.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {

    private final MenuItemDAO dao = new MenuItemDAO();

    @PostMapping
    public String addMenuItem(@RequestBody MenuItemRequest request) {

        MenuItem item;

        if (request.getCategory().equalsIgnoreCase("Food")) {
            item = new FoodItem(request.getName(), request.getPrice());
        } else {
            item = new DrinkItem(request.getName(), request.getPrice());
        }

        dao.addMenuItem(item);
        return "Menu item added successfully";
    }

    @GetMapping
    public void getAllMenuItems() {
        dao.getAllMenuItems();
    }

    @PutMapping("/{name}")
    public String updatePrice(@PathVariable String name,
                              @RequestParam double price) {
        dao.updatePrice(name, price);
        return "Price updated successfully";
    }

    @DeleteMapping("/{name}")
    public String deleteMenuItem(@PathVariable String name) {
        dao.deleteMenuItem(name);
        return "Menu item deleted successfully";
    }
}

package com.example.restaurant.controller; // <-- пакет всегда первый

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    // Пока без DAO, просто тестовые данные
    @GetMapping
    public List<String> getMenu() {
        return List.of("Beshbarmak - 2500 tg", "Lagman - 2000 tg");
    }
}



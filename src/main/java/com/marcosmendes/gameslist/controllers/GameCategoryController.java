package com.marcosmendes.gameslist.controllers;

import com.marcosmendes.gameslist.dto.GameCategoryDTO;
import com.marcosmendes.gameslist.dto.GameDTO;
import com.marcosmendes.gameslist.services.GameCategoryService;
import com.marcosmendes.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class GameCategoryController {
    @Autowired
    private GameCategoryService gameCategoryService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameCategoryDTO> getAll() {
        return gameCategoryService.getAll();
    }

    @GetMapping(value = "/{categoryId}/games")
    public List<GameDTO> getByList(@PathVariable Long categoryId) {
        return gameService.getByCategory(categoryId);
    }
}

package com.marcosmendes.gameslist.controllers;

import com.marcosmendes.gameslist.dto.GameDTO;
import com.marcosmendes.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> getAll() {
        return gameService.getAll();
    }
}

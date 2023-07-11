package com.marcosmendes.gameslist.services;

import com.marcosmendes.gameslist.dto.GameDTO;
import com.marcosmendes.gameslist.entities.Game;
import com.marcosmendes.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> getAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameDTO::new).toList();
    }
}

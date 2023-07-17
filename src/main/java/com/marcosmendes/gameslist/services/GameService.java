package com.marcosmendes.gameslist.services;

import com.marcosmendes.gameslist.dto.GameDTO;
import com.marcosmendes.gameslist.dto.GameDetailsDTO;
import com.marcosmendes.gameslist.entities.Game;
import com.marcosmendes.gameslist.projections.GameProjection;
import com.marcosmendes.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameDTO> getAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDetailsDTO getById(Long gameId) {
        Game result = gameRepository.findById(gameId).get();
        return new GameDetailsDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameDTO> getByCategory(Long categoryId) {
        List<GameProjection> result = gameRepository.searchByList(categoryId);
        return result.stream().map(GameDTO::new).toList();
    }
}

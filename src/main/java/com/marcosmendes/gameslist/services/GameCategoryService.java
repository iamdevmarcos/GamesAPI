package com.marcosmendes.gameslist.services;

import com.marcosmendes.gameslist.dto.GameCategoryDTO;
import com.marcosmendes.gameslist.entities.GameList;
import com.marcosmendes.gameslist.repositories.GameCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameCategoryService {
    @Autowired
    private GameCategoryRepository gameCategoryRepository;

    @Transactional(readOnly = true)
    public List<GameCategoryDTO> getAll() {
        List<GameList> result = gameCategoryRepository.findAll();
        return result.stream().map(GameCategoryDTO::new).toList();
    }
}

package com.marcosmendes.gameslist.repositories;

import com.marcosmendes.gameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameCategoryRepository extends JpaRepository<GameList, Long> {

}

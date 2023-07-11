package com.marcosmendes.gameslist.repositories;

import com.marcosmendes.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}

package com.marcosmendes.gameslist.repositories;

import com.marcosmendes.gameslist.entities.Game;
import com.marcosmendes.gameslist.projections.GameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.platforms, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :categoryId
		ORDER BY tb_game.id DESC
			""")

	List<GameProjection> searchByList(Long categoryId);
}

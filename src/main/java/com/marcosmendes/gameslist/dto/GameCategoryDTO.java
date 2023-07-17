package com.marcosmendes.gameslist.dto;

import com.marcosmendes.gameslist.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameCategoryDTO {
    private Long id;
    private String name;

    public GameCategoryDTO(GameList list) {
        this.id = list.getId();
        this.name = list.getName();
    }
}

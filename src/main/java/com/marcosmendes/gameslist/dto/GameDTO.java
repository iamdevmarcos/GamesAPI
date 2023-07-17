package com.marcosmendes.gameslist.dto;

import com.marcosmendes.gameslist.entities.Game;
import com.marcosmendes.gameslist.projections.GameProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private String platforms;

    public GameDTO(Game game) {
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
        this.platforms = game.getPlatforms();
    }

    public GameDTO(GameProjection gameProjection) {
        this.id = gameProjection.getId();
        this.title = gameProjection.getTitle();
        this.year = gameProjection.getGameYear();
        this.imgUrl = gameProjection.getImgUrl();
        this.shortDescription = gameProjection.getShortDescription();
        this.platforms = gameProjection.getPlatforms();
    }
}

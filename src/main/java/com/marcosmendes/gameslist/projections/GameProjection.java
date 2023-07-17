package com.marcosmendes.gameslist.projections;

public interface GameProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
    String getPlatforms();
}

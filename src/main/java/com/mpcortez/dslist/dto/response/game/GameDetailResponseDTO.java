package com.mpcortez.dslist.dto.response.game;

import com.mpcortez.dslist.entities.Game;

public record GameDetailResponseDTO(Long id, String title, Integer year, String genre, String platforms, Double score,
                                    String imgUrl, String shortDescription, String longDescription) {


    public GameDetailResponseDTO(Game entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getGenre(), entity.getPlatforms(),
                entity.getScore(), entity.getImgUrl(), entity.getShortDescription(), entity.getLongDescription());
    }

}

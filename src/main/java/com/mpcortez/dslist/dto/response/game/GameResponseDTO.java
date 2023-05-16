package com.mpcortez.dslist.dto.response.game;

import com.mpcortez.dslist.entities.Game;

public record GameResponseDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {

    public GameResponseDTO(Game entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());
    }
}

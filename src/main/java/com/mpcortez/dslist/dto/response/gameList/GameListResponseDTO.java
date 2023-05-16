package com.mpcortez.dslist.dto.response.gameList;

import com.mpcortez.dslist.entities.GameList;

public record GameListResponseDTO(Long id, String name) {

    public GameListResponseDTO(GameList entity) {
        this(entity.getId(), entity.getName());
    }
}

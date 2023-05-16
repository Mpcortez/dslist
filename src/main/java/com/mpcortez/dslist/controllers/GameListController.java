package com.mpcortez.dslist.controllers;

import com.mpcortez.dslist.dto.response.game.GameResponseDTO;
import com.mpcortez.dslist.dto.response.gameList.GameListResponseDTO;
import com.mpcortez.dslist.services.GameListService;
import com.mpcortez.dslist.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService service;
    private final GameService gameService;

    @GetMapping
    public Page<GameListResponseDTO> findAllPageable(Pageable pageable) {
        return service.findAllPageable(pageable);
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameResponseDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}

package com.mpcortez.dslist.controllers;

import com.mpcortez.dslist.dto.response.game.GameDetailResponseDTO;
import com.mpcortez.dslist.dto.response.game.GameResponseDTO;
import com.mpcortez.dslist.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/games")
public class GameController {

    private final GameService service;

    @GetMapping(value = "/{id}")
    public GameDetailResponseDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public Page<GameResponseDTO> findAllPageable(Pageable pageable) {
        return service.findAllPageable(pageable);
    }
}

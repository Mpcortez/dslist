package com.mpcortez.dslist.services.impl;

import com.mpcortez.dslist.dto.response.game.GameDetailResponseDTO;
import com.mpcortez.dslist.dto.response.game.GameResponseDTO;
import com.mpcortez.dslist.repositories.GameRepository;
import com.mpcortez.dslist.services.BelongingService;
import com.mpcortez.dslist.services.GameService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository repository;
    private final BelongingService belongingService;

    @Override
    public GameDetailResponseDTO findById(Long id) {
        if (Objects.nonNull(id)) {
            val game = repository.findById(id).orElseThrow(() -> new RuntimeException("ID not found: " + id));
            return new GameDetailResponseDTO(game);
        }
        throw new IllegalArgumentException("ID cannot be null");
    }

    @Override
    public Page<GameResponseDTO> findAllPageable(Pageable pageable) {
        return repository.findAll(pageable).map(GameResponseDTO::new);
    }

    @Override
    public List<GameResponseDTO> findByList(Long listId) {
        val gamesId = belongingService.findGamesByList(listId);
        return repository.findAllById(List.of(gamesId)).stream().map(GameResponseDTO::new).toList();
    }
}

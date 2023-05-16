package com.mpcortez.dslist.services.impl;

import com.mpcortez.dslist.dto.response.gameList.GameListResponseDTO;
import com.mpcortez.dslist.repositories.GameListRepository;
import com.mpcortez.dslist.services.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameListServiceImpl implements GameListService {

    private final GameListRepository repository;

    @Override
    public Page<GameListResponseDTO> findAllPageable(Pageable pageable) {
        return repository.findAll(pageable).map(GameListResponseDTO::new);
    }
}

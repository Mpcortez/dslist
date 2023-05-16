package com.mpcortez.dslist.services;
import com.mpcortez.dslist.dto.response.game.GameDetailResponseDTO;
import com.mpcortez.dslist.dto.response.game.GameResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GameService {

    @Transactional(readOnly = true)
    GameDetailResponseDTO findById(Long id);

    @Transactional(readOnly = true)
    Page<GameResponseDTO> findAllPageable(Pageable pageable);

    @Transactional(readOnly = true)
    List<GameResponseDTO> findByList(Long listId);
}

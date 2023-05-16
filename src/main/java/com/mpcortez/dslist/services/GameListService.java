package com.mpcortez.dslist.services;

import com.mpcortez.dslist.dto.response.gameList.GameListResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

public interface GameListService {

    @Transactional(readOnly = true)
    Page<GameListResponseDTO> findAllPageable(Pageable pageable);
}

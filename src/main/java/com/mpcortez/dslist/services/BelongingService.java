package com.mpcortez.dslist.services;

import org.springframework.transaction.annotation.Transactional;

public interface BelongingService {

    @Transactional(readOnly = true)
    Long[] findGamesByList(Long listId);
}

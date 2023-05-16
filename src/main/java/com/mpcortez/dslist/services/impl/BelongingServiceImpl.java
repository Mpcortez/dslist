package com.mpcortez.dslist.services.impl;

import com.mpcortez.dslist.repositories.BelongingRepository;
import com.mpcortez.dslist.services.BelongingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BelongingServiceImpl implements BelongingService {

    private final BelongingRepository repository;

    @Override
    public Long[] findGamesByList(Long listId) {
        return repository.findGamesByList(listId);
    }
}

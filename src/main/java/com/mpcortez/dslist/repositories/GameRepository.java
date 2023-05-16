package com.mpcortez.dslist.repositories;

import com.mpcortez.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

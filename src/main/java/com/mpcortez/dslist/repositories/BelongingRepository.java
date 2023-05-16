package com.mpcortez.dslist.repositories;

import com.mpcortez.dslist.entities.Belonging;
import com.mpcortez.dslist.entities.pk.BelongingPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
    @Query("SELECT bl.id.game.id FROM Belonging bl WHERE bl.id.gameList.id = :listId ORDER BY bl.position")
    Long[] findGamesByList(@Param("listId") Long listId);

}

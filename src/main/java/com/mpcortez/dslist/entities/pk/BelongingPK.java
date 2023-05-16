package com.mpcortez.dslist.entities.pk;

import com.mpcortez.dslist.entities.Game;
import com.mpcortez.dslist.entities.GameList;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Embeddable
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BelongingPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
}

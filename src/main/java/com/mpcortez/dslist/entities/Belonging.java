package com.mpcortez.dslist.entities;

import com.mpcortez.dslist.entities.pk.BelongingPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Belonging implements Serializable {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private BelongingPK id;

    private Integer position;
}

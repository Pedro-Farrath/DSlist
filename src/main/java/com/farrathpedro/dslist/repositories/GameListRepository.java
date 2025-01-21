package com.farrathpedro.dslist.repositories;

import com.farrathpedro.dslist.entities.Game;
import com.farrathpedro.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

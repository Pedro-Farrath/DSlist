package com.farrathpedro.dslist.services;

import com.farrathpedro.dslist.dto.GameDTO;
import com.farrathpedro.dslist.dto.GameListDTO;
import com.farrathpedro.dslist.dto.GameMinDTO;
import com.farrathpedro.dslist.entities.Game;
import com.farrathpedro.dslist.entities.GameList;
import com.farrathpedro.dslist.repositories.GameListRepository;
import com.farrathpedro.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}

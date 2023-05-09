package com.guvictorio.dslist.services;

import com.guvictorio.dslist.dto.GameMinDTO;
import com.guvictorio.dslist.entities.Game;
import com.guvictorio.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}

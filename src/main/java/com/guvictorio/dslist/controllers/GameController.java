package com.guvictorio.dslist.controllers;

import com.guvictorio.dslist.dto.GameDTO;
import com.guvictorio.dslist.dto.GameMinDTO;
import com.guvictorio.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = service.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findall() {
        List<GameMinDTO> result = service.findAll();
        return result;
    }
}

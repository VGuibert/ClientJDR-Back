package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.services.CharacterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping(path = "/characters")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping
    public List<Character> findAll(){
        return characterService.findAll();
    }
}

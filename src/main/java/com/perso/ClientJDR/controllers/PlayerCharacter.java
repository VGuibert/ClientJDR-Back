package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.services.PlayerCharacterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(path="/playerCharacters")
public class PlayerCharacter {

    private final PlayerCharacterService playerCharacterService;

    @GetMapping
    public List<Character> findall(){
        return playerCharacterService.findall();
    }

    @PostMapping
    public  Character save(Character newCharacter) {
        newCharacter.setId(null);
        return playerCharacterService.save(newCharacter);}
}

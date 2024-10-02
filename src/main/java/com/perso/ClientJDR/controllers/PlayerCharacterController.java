package com.perso.ClientJDR.controllers;
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
    public List<PlayerCharacter> findall(){
        return playerCharacterService.findall();
    }

    @GetMapping

    public

    @PostMapping
    public  PlayerCharacter save(PlayerCharacter newPlayerCharacter) {
        newPlayerCharacter.setId(null);
        return playerCharacterService.save(newPlayerCharacter);}
}

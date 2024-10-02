package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.services.CharacterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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


    @GetMapping("/{id}")
    public Character findById(@PathVariable UUID id){
        return characterService.findById(id);
    }


    @PostMapping
    public Character create(Character newCharacter) {
        newCharacter.setId(null);
        return characterService.save(newCharacter); }

    @PutMapping
    public Character update(String id,Character updateCharacter) {
        updateCharacter.setId(UUID.fromString(id));
        return characterService.save(updateCharacter);
    }

//    @PatchMapping
//    public Character partialUpdate(Character partialCharacterUpdate,String id) {
//        partialCharacterUpdate.setId(UUID.fromString(id));
//        return characterService.save(partialCharacterUpdate);
//    }

    @DeleteMapping
    public void delete(String id){
        characterService.delete(UUID.fromString(id));
    }
}

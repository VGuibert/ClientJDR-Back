package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.repositories.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> findAll (){
        return characterRepository.findAll();
    }

}

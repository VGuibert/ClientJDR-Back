package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.repositories.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> findAll (){
        return characterRepository.findAll();
    }

    public Character save (Character newCharacter) { return  characterRepository.save(newCharacter);}

    public void delete (UUID id) {
        characterRepository.deleteById(id);
    }

}

package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.repositories.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public List<Character> findAll (){
        return characterRepository.findAll();
    }

    public Character findById (final UUID id){
        return characterRepository.findById(id).orElseThrow();
    }

    public Character save (Character newCharacter) { return  characterRepository.save(newCharacter);}

    public void delete (UUID id) {
        characterRepository.deleteById(id);
    }

}

package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Character;
import com.perso.ClientJDR.entities.PlayerCharacter;
import com.perso.ClientJDR.repositories.PlayerCharacterRepository;
import com.perso.ClientJDR.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerCharacterService {

    private final PlayerCharacterRepository playerCharacterRepository;

    public List<Character> findall() {
        return playerCharacterRepository.findAll();
    }

    public Character save(Character newCharacter) {return  playerCharacterRepository.save(newCharacter); }
}

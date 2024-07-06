package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Player;
import com.perso.ClientJDR.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public List<Player> findall() { return playerRepository.findAll();}

    public Player save(Player newPlayer) { return playerRepository.save(newPlayer);}

    public void delete(UUID id) { playerRepository.deleteById(id);}
}

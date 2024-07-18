package com.perso.ClientJDR.services;

import com.perso.ClientJDR.repositories.NpcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NpcService {

    private final NpcRepository npcRepository;

    public List<Npc> findall() { return npcRepository.findAll();}
    public Npc save(Npc newNpc) { return npcRepository.save(newNpc);}

    public void delete (UUID id) { npcRepository.deleteById(id);}
}

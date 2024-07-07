package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Npc;
import com.perso.ClientJDR.services.NpcService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path="npcs")
public class NpcController {

    private final NpcService npcService;

    @GetMapping
    public List<Npc> findall() { return  npcService.findall();}

    @PostMapping
    public Npc save(Npc newNpc) {
        newNpc.setId(null);
        return npcService.save(newNpc);
    }

    @PutMapping
    public Npc update(Npc updateNpc,String id) {
        updateNpc.setId(UUID.fromString(id));
        return npcService.save(updateNpc);
    }

    @DeleteMapping
    public void delete(String id) { npcService.delete(UUID.fromString(id));}
}

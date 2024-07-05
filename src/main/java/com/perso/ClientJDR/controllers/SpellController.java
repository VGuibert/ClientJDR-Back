package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Spell;
import com.perso.ClientJDR.services.SpellService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/skills")
public class SpellController {

    private final SpellService spellService;
    @GetMapping
    public List<Spell> findall () { return spellService.findall(); }

    @PostMapping
    public Spell save (Spell newSpell) {
        newSpell.setId(null);
        return spellService.save(newSpell);}

    @PutMapping
    public Spell update (Spell updateSpell, String id) {
        updateSpell.setId(UUID.fromString(id));
        return spellService.save(updateSpell);}

    @DeleteMapping
    public void delete(UUID id) { spellService.delete(id);}

}

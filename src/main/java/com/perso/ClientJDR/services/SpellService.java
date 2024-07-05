package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Spell;
import com.perso.ClientJDR.repositories.SpellRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SpellService {

    private final SpellRepository spellRepository;
    public List<Spell> findall () { return spellRepository.findAll(); }
    public Spell save (Spell newSpell) { return  spellRepository.save(newSpell);}
    public void delete (UUID id) {
        spellRepository.deleteById(id);}
}

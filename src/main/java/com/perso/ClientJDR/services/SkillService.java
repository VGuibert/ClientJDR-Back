package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Skill;
import com.perso.ClientJDR.repositories.SkillRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;
    public List<Skill> findall () { return skillRepository.findAll(); }
    public  Skill save ( Skill newSkill) { return  skillRepository.save(newSkill);}
    public void delete (UUID id) {skillRepository.deleteById(id);}
}

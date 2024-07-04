package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Skill;
import com.perso.ClientJDR.services.SkillService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/skills")
public class SkillController {

    private final SkillService skillService;
    @GetMapping
    public List<Skill> findall () { return skillService.findall(); }

    @PostMapping
    public Skill save (Skill newSkill) {
        newSkill.setId(null);
        return skillService.save(newSkill);}

    @PutMapping
    public  Skill update (Skill updateSkill, String id) {
        updateSkill.setId(UUID.fromString(id));
        return skillService.save(updateSkill);}

    @DeleteMapping
    public void delete(UUID id) { skillService.delete(id);}

}

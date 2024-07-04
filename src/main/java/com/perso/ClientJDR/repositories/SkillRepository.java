package com.perso.ClientJDR.repositories;

import com.perso.ClientJDR.config.jpa.ClientJdrRepository;
import com.perso.ClientJDR.entities.Skill;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SkillRepository extends ClientJdrRepository<Skill, UUID> {
}

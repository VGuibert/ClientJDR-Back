package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.Proficiency;
import com.perso.ClientJDR.enums.Skill;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Background {

    @Id
    @GeneratedValue
    private UUID id;
    @Enumerated(EnumType.STRING)
    private List<Skill> masteredSkill;
    @Enumerated(EnumType.STRING)
    private List<Proficiency> startingProficiencies;
    private Integer bonusLanguageStat;
}

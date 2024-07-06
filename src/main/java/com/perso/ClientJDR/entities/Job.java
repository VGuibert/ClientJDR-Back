package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.Characteristic;
import com.perso.ClientJDR.enums.Proficiency;
import com.perso.ClientJDR.enums.Skill;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
public class Job {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
//    private Map<Integer, Integer> masteryBonus;
    private List<Skill> startingSkillChoice;
    private Integer nbSkillChoice;
    private Integer startingHealthBase;
    private String healthPerLevel;
    @Enumerated(EnumType.STRING)
    private List<Proficiency> startingProficiencies;
    @Enumerated(EnumType.STRING)
    private List<Characteristic> savingThrows;

}

package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.Characteristic;
import com.perso.ClientJDR.enums.Language;
import com.perso.ClientJDR.enums.Skill;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
public class Character {

    @Id
    @GeneratedValue
    private UUID id;
    private Integer level;
    private String name;
    private Integer armorClass;
    @ManyToOne
    private Job job;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer tmpHealth;
    private String notes;
    @Enumerated(EnumType.STRING)
    private List<Language> language;
//    private Map<Skill, Integer> masteries;
//    private Map<Characteristic, Integer> stats;

}

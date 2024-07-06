package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.Characteristic;
import com.perso.ClientJDR.enums.Language;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
public class Npc {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String type;
    private String alignement;
    private Integer armorClass;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer tmpHealth;
    @Enumerated(EnumType.STRING)
    private List<Language> languages;
//    private Map<Characteristic, Integer> stats;
}

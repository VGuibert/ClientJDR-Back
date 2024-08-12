package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
public class Character {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer armorClass;
    private String alignement;
    @OneToMany
    private List<Language> language;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer tmpHealth;
    private String notes;
    @OneToMany
    private List<Spell> spell;
    @OneToMany
    private List<Characteristic> characteristic;
    @OneToMany
    private List<Campaign> campaign;

}

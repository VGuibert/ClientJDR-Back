package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class PlayerCharacter extends Character{
    @Id
    @GeneratedValue
    private UUID id;
    private Integer level;
    @ManyToMany
    private Spell spell;
    @ManyToOne
    private Background background;
    @ManyToMany
    private Skill skill;
    @ManyToMany
    private Proficiency proficiency;
    @ManyToOne
    private Job job;
    @ManyToMany
    private Feature feature;
    @ManyToOne
    private Race race;
}

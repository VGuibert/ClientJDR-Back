package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
public class PlayerCharacter extends Character{
    @Id
    @GeneratedValue
    private UUID id;
    private Integer level;
    @OneToOne
    private Background background;
    @OneToMany
    private List<Skill> skill;
    @OneToMany
    private List<Proficiency> proficiency;
    @OneToMany
    private List<Job> job;
    @OneToMany
    private List<Feature> feature;
    @ManyToOne
    private Race race;
}

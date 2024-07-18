package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Job {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String healthPerLevel;
    private Integer level;
    @ManyToMany
    private Characteristic characteristic;
    @ManyToOne
    private JobMasteryBonus jobMasteryBonus;
}

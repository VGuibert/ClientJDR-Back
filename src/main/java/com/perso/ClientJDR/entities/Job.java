package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private int nbSkillChoice;
    private int startingHealthBase;
    private String healthPerLevel;

}

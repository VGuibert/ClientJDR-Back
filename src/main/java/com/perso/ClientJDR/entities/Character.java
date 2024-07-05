package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Character {

    @Id
    @GeneratedValue
    private UUID id;
    private int level;
    private String name;
    private int armorClass;
    private Job job;
    private int currentHealth;
    private int maxHealth;
    private int tmpHealth;
    private String notes;

}

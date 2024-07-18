package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Character {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer armorClass;
    private String alignement;
    private String type;
    @ManyToMany
    private Language language;
    private Integer currentHealth;
    private Integer maxHealth;
    private Integer tmpHealth;
    private String notes;
    @ManyToOne
    private Campaign campaign;

}

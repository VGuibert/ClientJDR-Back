package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Spell {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;
    private Integer spellLevel;
    @ManyToOne
    private MagicSchool magicSchool;

}

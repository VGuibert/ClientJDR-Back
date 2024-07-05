package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.MagicSchool;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private int spellLevel;
    private MagicSchool magicSchool;

}

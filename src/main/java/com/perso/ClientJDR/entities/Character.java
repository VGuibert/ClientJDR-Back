package com.perso.ClientJDR.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class Character {

    private UUID uniqueId;
    private int level;
    private String name;

}

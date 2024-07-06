package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Player {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;

}

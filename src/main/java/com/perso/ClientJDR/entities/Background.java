package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Background {

    @Id
    @GeneratedValue
    private UUID id;
    private int bonusLanguageStat;
}

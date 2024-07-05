package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Campaign {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private String resume;
    private int currentChapter;
}

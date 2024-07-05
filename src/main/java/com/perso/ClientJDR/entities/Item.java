package com.perso.ClientJDR.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Boolean keyItem;
    private int weight;
    private int quantity;
    private String damage;
    private String description;

}

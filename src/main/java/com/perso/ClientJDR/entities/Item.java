package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
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
    private Integer weight;
    @ManyToOne
    private ItemCategory itemCategory;
    private Integer quantity;
    private String damage;
    private Integer armorClass;
    private String description;
    private String notes;

}

package com.perso.ClientJDR.entities;

import com.perso.ClientJDR.enums.ItemCategory;
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
    @Enumerated(EnumType.STRING)
    private ItemCategory itemCategory;
    private Integer quantity;
    private String damage;
    private String description;

}

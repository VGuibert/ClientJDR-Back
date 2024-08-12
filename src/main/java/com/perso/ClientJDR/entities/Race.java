package com.perso.ClientJDR.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.EnumType.STRING;

@Data
@Entity
public class Race {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    @ManyToOne
    private Trait trait;

}

package com.perso.ClientJDR.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Background {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
}

package com.perso.ClientJDR.entities;


import com.perso.ClientJDR.enums.Characteristic;
import com.perso.ClientJDR.enums.Language;
import com.perso.ClientJDR.enums.Proficiency;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
public class Race {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private Integer nbProficiencyChoice;
    private String traits;
//    private Map<Characteristic, Integer> characteristicBonuses;
    @Enumerated(EnumType.STRING)
    private List<Proficiency> startingProficiencies;
    @Enumerated(EnumType.STRING)
    private List<Proficiency> startingProficiencyChoice;
    @Enumerated(EnumType.STRING)
    private List<Language> startingLanguages;
    @OneToMany
    private List<Feature> startingFeature;

}

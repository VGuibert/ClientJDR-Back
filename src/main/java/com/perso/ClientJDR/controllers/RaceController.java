package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Race;
import com.perso.ClientJDR.services.RaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path="races")
public class RaceController {

    private final RaceService raceService;

    @GetMapping
    public List<Race> findall() {return  raceService.findall();}

    @PostMapping
    public Race save (Race newRace) {
        newRace.setId(null);
        return raceService.save(newRace);
    }

    @PutMapping
    public Race update(Race updateRace, String id) {
        updateRace.setId(UUID.fromString(id));
        return raceService.save(updateRace);
    }

    @DeleteMapping
    public void delete(String id) { raceService.delete(UUID.fromString(id));}
}

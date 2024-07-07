package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Background;
import com.perso.ClientJDR.services.BackgroundService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path="backgrounds")
public class BackgroundController {

    private final BackgroundService backgroundService;

    // endpoint juste pour vérifier les backgrounds à supprimer plus tard pour un ID
    @GetMapping
    public List<Background> findall() { return backgroundService.findall(); }

    @PostMapping
    public Background save( Background newBackground) {
        newBackground.setId(null);
        return backgroundService.save(newBackground);
    }

    @PutMapping
    public Background update ( String id, Background updateBackground) {
        updateBackground.setId(UUID.fromString(id));
        return backgroundService.save(updateBackground);
    }

    @DeleteMapping
    public void delete(String id){ backgroundService.delete(UUID.fromString(id));}

}

package com.perso.ClientJDR.controllers;

import com.perso.ClientJDR.entities.Feature;
import com.perso.ClientJDR.services.FeatureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path= "/features")
public class FeatureController {

    private final FeatureService featureService;

    @GetMapping
    public List<Feature> findall(){ return featureService.findall();}

    @PostMapping
    public Feature save(Feature newFeature) {
        newFeature.setId(null);
        return featureService.save(newFeature);
    }

    @PutMapping
    public Feature update(String id,Feature updateFeature) {
        updateFeature.setId(UUID.fromString(id));
        return featureService.save(updateFeature);
    }

    @DeleteMapping
    public void delete(String id) { featureService.delete(UUID.fromString(id)); }

}

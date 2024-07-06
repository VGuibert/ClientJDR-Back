package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Feature;
import com.perso.ClientJDR.repositories.FeatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FeatureService {

    private final FeatureRepository featureRepository;

    public List<Feature> findall() {return featureRepository.findAll();}

    public Feature save (Feature newFeature) {return featureRepository.save(newFeature);}

    public void delete(UUID id) { featureRepository.deleteById(id);}

}

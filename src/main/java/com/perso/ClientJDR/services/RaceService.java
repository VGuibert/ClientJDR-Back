package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Race;
import com.perso.ClientJDR.repositories.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class RaceService {

    private final RaceRepository raceRepository;

    public List<Race> findall() { return raceRepository.findAll();}

    public Race save(Race newRace) {return raceRepository.save(newRace);}

    public void delete (UUID id) { raceRepository.deleteById(id);}

}

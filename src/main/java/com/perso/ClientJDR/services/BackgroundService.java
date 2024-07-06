package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Background;
import com.perso.ClientJDR.repositories.BackgroundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BackgroundService {

    private final BackgroundRepository backgroundRepository;

    public List<Background> findall() { return backgroundRepository.findAll();}

    public Background save (Background newBackground) { return  backgroundRepository.save(newBackground);}

    public void delete (UUID id) { backgroundRepository.deleteById(id);}
}

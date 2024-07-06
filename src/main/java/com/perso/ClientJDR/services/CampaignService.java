package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Campaign;
import com.perso.ClientJDR.repositories.CampaignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CampaignService {
    private final CampaignRepository campaignRepository;

    public List<Campaign> findall() {return campaignRepository.findAll();}

    public Campaign save(Campaign newCampaign) {return  campaignRepository.save(newCampaign);}

    public void delete(UUID id) { campaignRepository.deleteById(id);}
}

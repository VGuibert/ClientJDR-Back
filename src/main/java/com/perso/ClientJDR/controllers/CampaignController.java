package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Campaign;
import com.perso.ClientJDR.services.CampaignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path="campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    // endpoint juste pour vérifier les backgrounds à supprimer plus tard pour un ID
    @GetMapping
    public List<Campaign> findall() { return campaignService.findall();}

    @PostMapping
    public Campaign save(Campaign newCampaign) {
        newCampaign.setId(null);
        return campaignService.save(newCampaign);
    }

    @PutMapping
    public Campaign update(String id, Campaign updateCampaign) {
        updateCampaign.setId(UUID.fromString(id));
        return campaignService.save(updateCampaign);
    }

    @DeleteMapping
    public void delete(String id) { campaignService.delete(UUID.fromString(id));}

}

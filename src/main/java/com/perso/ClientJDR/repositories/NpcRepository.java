package com.perso.ClientJDR.repositories;

import com.perso.ClientJDR.config.jpa.ClientJdrRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NpcRepository extends ClientJdrRepository<Npc, UUID> {
}

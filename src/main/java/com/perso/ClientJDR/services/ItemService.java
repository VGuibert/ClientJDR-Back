package com.perso.ClientJDR.services;

import com.perso.ClientJDR.entities.Item;
import com.perso.ClientJDR.repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> findall() { return itemRepository.findAll();}

    public Item save (Item newItem) { return itemRepository.save(newItem); }

    public void delete(UUID id) { itemRepository.deleteById(id);}

}

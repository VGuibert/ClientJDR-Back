package com.perso.ClientJDR.controllers;


import com.perso.ClientJDR.entities.Item;
import com.perso.ClientJDR.services.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping(path="/items")
public class ItemController {
    private final ItemService itemService;

    @GetMapping
    public List<Item> findall() {return  itemService.findall();}

    @PostMapping
    public Item save(Item newItem) {
        newItem.setId(null);
        return itemService.save(newItem);}

    @PutMapping
    public Item save(Item updateItem, String id) {
        updateItem.setId(UUID.fromString(id));
        return itemService.save(updateItem);
    }

    @DeleteMapping
    public void delete(String id) { itemService.delete(UUID.fromString(id));}
}

package org.icet.rms.controller;

import org.icet.rms.dto.Item;
import org.icet.rms.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/items")
public class ItemController {

    ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    final private ItemService itemService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    void saveItem(@RequestBody Item item){
        itemService.persist(item);
    }
}

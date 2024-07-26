package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Item;
import org.icet.rms.entity.ItemEntity;
import org.icet.rms.repository.ItemRepository;
import org.icet.rms.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    ItemServiceImpl(ObjectMapper mapper,ItemRepository repository){
        this.repository = repository;
        this.mapper = mapper;
    }

    final private ObjectMapper mapper;
    final private ItemRepository repository;

    @Override
    public void persist(Item item) {
        repository.save(mapper.convertValue(item, ItemEntity.class));
    }
}

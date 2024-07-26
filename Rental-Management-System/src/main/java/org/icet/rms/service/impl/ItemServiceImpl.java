package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Item;
import org.icet.rms.entity.ItemEntity;
import org.icet.rms.repository.ItemRepository;
import org.icet.rms.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Item> retrieve() {
        List<Item> list = new ArrayList<>();
        Iterable<ItemEntity> all = repository.findAll();
        all.forEach(element ->{
            list.add(mapper.convertValue(element,Item.class));
        });
        return list;
    }

    @Override
    public String delete(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
        }else{
            return "id Not Found!!";
        }
        return "Deleted!!";
    }
}

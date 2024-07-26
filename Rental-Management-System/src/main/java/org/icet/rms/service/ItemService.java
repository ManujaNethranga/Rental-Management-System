package org.icet.rms.service;

import org.icet.rms.dto.Item;

import java.util.List;

public interface ItemService {
    void persist(Item item);

    List<Item> retrieve();

    String delete(Long id);
}

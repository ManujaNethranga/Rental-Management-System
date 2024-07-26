package org.icet.rms.repository;

import org.icet.rms.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,Long> {
}

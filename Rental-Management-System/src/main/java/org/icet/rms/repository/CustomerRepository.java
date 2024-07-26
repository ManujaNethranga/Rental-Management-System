package org.icet.rms.repository;

import org.icet.rms.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerEntity,Long> {
    boolean existsByName(String name);

    CustomerEntity findByName(String name);
}

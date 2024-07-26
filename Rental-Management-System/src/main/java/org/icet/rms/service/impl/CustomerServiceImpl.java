package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Customer;
import org.icet.rms.entity.CustomerEntity;
import org.icet.rms.repository.CustomerRepository;
import org.icet.rms.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerServiceImpl(ObjectMapper mapper,CustomerRepository repository){
        this.mapper=mapper;
        this.repository = repository;
    }

    final private ObjectMapper mapper;
    final private CustomerRepository repository;


    @Override
    public void persist(Customer customer) {
        repository.save(mapper.convertValue(customer, CustomerEntity.class));
    }
}

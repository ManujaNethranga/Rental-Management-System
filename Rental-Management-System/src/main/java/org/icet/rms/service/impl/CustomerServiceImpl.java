package org.icet.rms.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.icet.rms.dto.Customer;
import org.icet.rms.entity.CustomerEntity;
import org.icet.rms.repository.CustomerRepository;
import org.icet.rms.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Customer> retrieve() {
        List<Customer> list = new ArrayList<>();
        Iterable<CustomerEntity> allCustomers = repository.findAll();
        allCustomers.forEach(element ->{
            list.add(mapper.convertValue(element,Customer.class));
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

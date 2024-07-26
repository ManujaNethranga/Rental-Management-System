package org.icet.rms.service;

import org.icet.rms.dto.Customer;

import java.util.List;

public interface CustomerService {
    void persist(Customer customer);

    List<Customer> retrieve();

    String delete(Long id);

    String update(Customer customer);

    Customer getById(Long id);
}

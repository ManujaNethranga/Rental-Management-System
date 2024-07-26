package org.icet.rms.controller;

import org.icet.rms.dto.Customer;
import org.icet.rms.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {

    final private CustomerService customerService;

    CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    void addCustomer(@RequestBody Customer customer){
        customerService.persist(customer);
    }

    @GetMapping()
    List<Customer> getCustomerList(){
        return customerService.retrieve();
    }

    @DeleteMapping("/{id}")
    String deleteCustomer(@PathVariable Long id){
        return customerService.delete(id);
    }

    @PutMapping()
    String updateCustomer(@RequestBody Customer customer){
        return customerService.update(customer);
    }

    @GetMapping("/{id}")
    Customer getById(@PathVariable Long id){
        return customerService.getById(id);
    }


}

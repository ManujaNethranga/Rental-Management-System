package org.icet.rms.controller;

import org.icet.rms.dto.Customer;
import org.icet.rms.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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


}

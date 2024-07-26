package org.icet.rms.controller;

import org.icet.rms.dto.Rental;
import org.icet.rms.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("rental")
public class RentalController {

    RentalController(RentalService rentalService){
        this.service = rentalService;
    }

    final private RentalService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    void saveRental(@RequestBody Rental rental){
        service.persist(rental);
    }

    @GetMapping()
    List<Rental>getAllRentals(){
        return service.retrieve();
    }
}

package org.icet.rms.controller;

import org.icet.rms.dto.Rental;
import org.icet.rms.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    void saveRental(Rental rental){
        service.save(rental);

    }
}

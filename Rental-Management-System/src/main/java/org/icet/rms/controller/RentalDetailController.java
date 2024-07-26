package org.icet.rms.controller;

import org.icet.rms.dto.RentalDetail;
import org.icet.rms.service.RentalDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rentalDetails")
public class RentalDetailController {

    RentalDetailController(RentalDetailService service){
        this.service = service;
    }

    final private RentalDetailService service;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    void saveRentalDetails(@RequestBody RentalDetail rentalDetail){
        service.persist(rentalDetail);
    }

    @GetMapping()
    List<RentalDetail> getAllRentalDetails(){
        return service.retrieve();
    }
}

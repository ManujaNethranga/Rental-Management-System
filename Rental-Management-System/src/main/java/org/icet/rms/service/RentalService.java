package org.icet.rms.service;

import org.icet.rms.dto.Rental;

import java.util.List;

public interface RentalService {
    void persist(Rental rental);

    List<Rental> retrieve();
}

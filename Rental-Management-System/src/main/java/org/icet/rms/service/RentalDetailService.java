package org.icet.rms.service;

import org.icet.rms.dto.RentalDetail;

import java.util.List;

public interface RentalDetailService {
    void persist(RentalDetail rentalDetail);

    List<RentalDetail> retrieve();
}

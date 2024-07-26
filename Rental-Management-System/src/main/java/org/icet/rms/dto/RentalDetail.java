package org.icet.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentalDetail {
    private Long rentalDetailId;
    private Integer qty;
    private Double totalCost;
}

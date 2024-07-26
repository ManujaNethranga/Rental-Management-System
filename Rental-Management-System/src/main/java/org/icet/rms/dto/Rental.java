package org.icet.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    private Long rentId;
    private String rentalDate;
    private String dueDate;
    private String returnDate;
    private Double fine;
    private Double totalCost;
}

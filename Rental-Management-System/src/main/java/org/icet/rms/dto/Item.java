package org.icet.rms.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long itemId;
    private String name;
    private Double rentalPerDay;
    private Double finePerDay;
    private Boolean availability;
}

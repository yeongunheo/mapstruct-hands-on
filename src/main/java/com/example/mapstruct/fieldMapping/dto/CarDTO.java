package com.example.mapstruct.fieldMapping.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(makeFinal = false, level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    int id;
    String name;
    FuelType fuelType;
}

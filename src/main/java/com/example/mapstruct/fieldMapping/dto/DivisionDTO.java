package com.example.mapstruct.fieldMapping.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = false, level = AccessLevel.PACKAGE)
@NoArgsConstructor
@AllArgsConstructor
public class DivisionDTO {
    int id;
    String name;
}

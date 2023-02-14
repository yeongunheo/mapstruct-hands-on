package com.example.mapstruct.fieldMapping.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = false, level = AccessLevel.PACKAGE)
@NoArgsConstructor
@AllArgsConstructor
public class Division {
    int id;
    String name;
}

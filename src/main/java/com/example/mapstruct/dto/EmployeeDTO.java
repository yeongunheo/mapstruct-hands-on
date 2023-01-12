package com.example.mapstruct.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private DivisionDTO division;
}

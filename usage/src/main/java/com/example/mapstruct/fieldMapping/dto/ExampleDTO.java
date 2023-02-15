package com.example.mapstruct.fieldMapping.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class ExampleDTO {
    private Long id;
    private String name;
}

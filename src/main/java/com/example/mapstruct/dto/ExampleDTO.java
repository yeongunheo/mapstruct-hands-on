package com.example.mapstruct.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class ExampleDTO {
    private Long id;
    private String name;
}

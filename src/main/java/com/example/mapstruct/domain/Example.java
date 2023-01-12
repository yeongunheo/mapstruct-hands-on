package com.example.mapstruct.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Example {
    private Long id;
    private String name;
}

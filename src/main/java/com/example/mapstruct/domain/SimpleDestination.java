package com.example.mapstruct.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class SimpleDestination {
    String name;
    String description;
}
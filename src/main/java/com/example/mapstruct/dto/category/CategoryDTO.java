package com.example.mapstruct.dto.category;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryDTO {

    private int id;

    private String name;

    private boolean isDefault;
}

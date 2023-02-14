package com.example.mapstruct.fieldMapping.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PACKAGE)
@RequiredArgsConstructor
public class TransactionDTO {
    private String uuid;
    private Long totalInCents;
}

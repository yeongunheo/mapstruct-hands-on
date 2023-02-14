package com.example.mapstruct.fieldMapping.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(makeFinal = false, level = AccessLevel.PACKAGE)
@AllArgsConstructor
public class Transaction {
    private Long id;

    @Builder.Default
    private String uuid = UUID.randomUUID().toString();
    private BigDecimal total;
}

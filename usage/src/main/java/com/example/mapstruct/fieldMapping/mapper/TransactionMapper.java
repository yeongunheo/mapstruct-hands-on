package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Transaction;
import com.example.mapstruct.fieldMapping.dto.TransactionDTO;
import org.mapstruct.Mapper;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Mapper
abstract class TransactionMapper {

    public TransactionDTO toTransactionDTO(Transaction transaction) {
        return TransactionDTO.builder()
                .uuid(transaction.getUuid())
                .totalInCents(transaction.getTotal()
                        .multiply(new BigDecimal("100")).longValue())
                .build();
    }

    public abstract List<TransactionDTO> toTransactionDTO(Collection<Transaction> transactions);
}

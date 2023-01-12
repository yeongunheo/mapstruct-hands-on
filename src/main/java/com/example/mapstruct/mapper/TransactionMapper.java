package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Transaction;
import com.example.mapstruct.dto.TransactionDTO;
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

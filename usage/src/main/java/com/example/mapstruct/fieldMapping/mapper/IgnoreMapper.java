package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Example;
import com.example.mapstruct.fieldMapping.dto.ExampleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IgnoreMapper {

    @Mapping(target = "id", ignore = true)
    Example toExample(ExampleDTO dto);
}

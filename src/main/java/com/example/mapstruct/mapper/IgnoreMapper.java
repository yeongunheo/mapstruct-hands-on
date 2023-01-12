package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Example;
import com.example.mapstruct.dto.ExampleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface IgnoreMapper {

    @Mapping(target = "id", ignore = true)
    Example toExample(ExampleDTO dto);
}

package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Person;
import com.example.mapstruct.fieldMapping.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "id", source = "person.id", defaultExpression = "java(java.util.UUID.randomUUID().toString())")
    PersonDTO personToPersonDTO(Person person);
}

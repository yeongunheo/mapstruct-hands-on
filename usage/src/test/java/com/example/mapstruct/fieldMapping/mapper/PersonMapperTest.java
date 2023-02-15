package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Person;
import com.example.mapstruct.fieldMapping.dto.PersonDTO;
import com.example.mapstruct.fieldMapping.mapper.PersonMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonMapperTest {
    @Test
    public void givenPersonEntitytoPersonWithExpression_whenMaps_thenCorrect() {
        //given
        Person entity = new Person();
        entity.setName("Micheal");

        //when
        PersonDTO personDto = PersonMapper.INSTANCE.personToPersonDTO(entity);

        //then
        assertNull(entity.getId());
        assertNotNull(personDto.getId());
        assertEquals(personDto.getName(), entity.getName());
    }
}

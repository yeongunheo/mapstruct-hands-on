package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Person;
import com.example.mapstruct.dto.PersonDTO;
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

package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Employee;
import com.example.mapstruct.domain.EmployeeDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapperTest {

    private EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect() {
        //given
        EmployeeDTO dto = new EmployeeDTO(1, "John");

        //when
        Employee entity = mapper.employeeDTOtoEmployee(dto);

        //then
        assertEquals(dto.getEmployeeId(), entity.getId());
        assertEquals(dto.getEmployeeName(), entity.getName());
    }
}
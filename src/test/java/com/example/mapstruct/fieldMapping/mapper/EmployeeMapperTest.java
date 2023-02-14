package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Employee;
import com.example.mapstruct.fieldMapping.dto.DivisionDTO;
import com.example.mapstruct.fieldMapping.dto.EmployeeDTO;
import com.example.mapstruct.fieldMapping.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapperTest {

    private static final String DATE_FORMAT = "dd-MM-yyyy HH:mm:ss";
    private EmployeeMapper mapper = Mappers.getMapper(EmployeeMapper.class);

    @Test
    public void givenEmployeeDTOwithDiffNametoEmployee_whenMaps_thenCorrect() {
        //given
        EmployeeDTO dto = EmployeeDTO.builder()
                .employeeId(1)
                .employeeName("John")
                .build();

        //when
        Employee entity = mapper.employeeDTOtoEmployee(dto);

        //then
        assertEquals(dto.getEmployeeId(), entity.getId());
        assertEquals(dto.getEmployeeName(), entity.getName());
    }

    @Test
    public void givenEmpDTONestedMappingToEmp_whenMaps_thenCorrect() {
        //given
        EmployeeDTO dto = EmployeeDTO.builder()
                .division(new DivisionDTO(1, "Division1"))
                .build();

        //when
        Employee entity = mapper.employeeDTOtoEmployee(dto);

        //then
        assertEquals(dto.getDivision().getId(),
                entity.getDivision().getId());
        assertEquals(dto.getDivision().getName(),
                entity.getDivision().getName());
    }

    @Test
    public void givenEmpStartDtMappingToEmpDTO_whenMaps_thenCorrect() throws ParseException {
        //given
        Employee entity = Employee.builder()
                .startDt(new Date())
                .build();

        //when
        EmployeeDTO dto = mapper.employeeToEmployeeDTO(entity);
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);

        //then
        assertEquals(format.parse(dto.getEmployeeStartDt()).toString(),
                entity.getStartDt().toString());
    }

    @Test
    public void givenEmpDTOStartDtMappingToEmp_whenMaps_thenCorrect() throws ParseException {
        //given
        EmployeeDTO dto = EmployeeDTO.builder()
                .employeeStartDt("01-04-2016 01:00:00")
                .build();

        //when
        Employee entity = mapper.employeeDTOtoEmployee(dto);
        SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT);

        //then
        assertEquals(format.parse(dto.getEmployeeStartDt()).toString(),
                entity.getStartDt().toString());
    }
}
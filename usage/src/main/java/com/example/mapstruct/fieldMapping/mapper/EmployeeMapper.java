package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.Division;
import com.example.mapstruct.fieldMapping.domain.Employee;
import com.example.mapstruct.fieldMapping.dto.DivisionDTO;
import com.example.mapstruct.fieldMapping.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface EmployeeMapper {

    @Mapping(target = "employeeId", source = "entity.id")
    @Mapping(target = "employeeName", source = "entity.name")
    @Mapping(target = "employeeStartDt", source = "entity.startDt", dateFormat = "dd-MM-yyyy HH:mm:ss")
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mapping(target = "id", source = "dto.employeeId")
    @Mapping(target = "name", source = "dto.employeeName")
    @Mapping(target = "startDt", source = "dto.employeeStartDt", dateFormat = "dd-MM-yyyy HH:mm:ss")
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

    DivisionDTO divisionToDivisionDTO(Division entity);

    Division divisionDTOtoDivision(DivisionDTO dto);
}

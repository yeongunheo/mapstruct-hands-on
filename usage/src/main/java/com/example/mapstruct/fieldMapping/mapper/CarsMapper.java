package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.fieldMapping.domain.BioDieselCar;
import com.example.mapstruct.fieldMapping.domain.Car;
import com.example.mapstruct.fieldMapping.domain.ElectricCar;
import com.example.mapstruct.fieldMapping.dto.CarDTO;
import com.example.mapstruct.fieldMapping.dto.FuelType;
import org.mapstruct.*;

@Mapper
public abstract class CarsMapper {
    @BeforeMapping
    protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDto) {
        if (car instanceof ElectricCar) {
            carDto.setFuelType(FuelType.ELECTRIC);
        }
        if (car instanceof BioDieselCar) {
            carDto.setFuelType(FuelType.BIO_DIESEL);
        }
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDTO carDto) {
        carDto.setName(carDto.getName().toUpperCase());
    }

    @Mapping(target = "fuelType", ignore = true)
    public abstract CarDTO toCarDto(Car car);
}

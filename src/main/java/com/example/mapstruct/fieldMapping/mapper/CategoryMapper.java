package com.example.mapstruct.fieldMapping.mapper;

import com.example.mapstruct.spi.Category;
import com.example.mapstruct.spi.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toDTO(Category entity);
}

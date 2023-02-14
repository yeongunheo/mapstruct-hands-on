package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Category;
import com.example.mapstruct.dto.category.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toDTO(Category entity);
}

package com.example.mapstruct.spi;

import com.example.mapstruct.fieldMapping.mapper.CategoryMapper;
import com.example.mapstruct.spi.Category;
import com.example.mapstruct.spi.CategoryDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryMapperTest {

    @Test
    public void mapper_boolean_test() {
        //given
        Category entity = new Category(1, "식품", true);

        //when
        CategoryDTO categoryDTO = CategoryMapper.INSTANCE.toDTO(entity);

        //then
        assertEquals(categoryDTO.getId(), 1);
        assertEquals(categoryDTO.getName(), "식품");
        assertTrue(categoryDTO.isDefault());
    }
}
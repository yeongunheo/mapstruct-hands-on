package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.Example;
import com.example.mapstruct.dto.ExampleDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class IgnoreMapperTest {

    private IgnoreMapper mapper = Mappers.getMapper(IgnoreMapper.class);

    @Test
    @DisplayName("ignore = true 속성은 target에 옮길때 해당 필드를 무시한다.")
    void test1() {
        //given
        var dto = ExampleDTO.builder()
                .id(1L)
                .name("example")
                .build();

        //when
        var example = mapper.toExample(dto);

        //then
        assertNull(example.getId());
    }
}
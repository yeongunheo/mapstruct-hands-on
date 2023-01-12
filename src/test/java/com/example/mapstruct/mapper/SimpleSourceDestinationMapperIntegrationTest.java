package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.SimpleDestination;
import com.example.mapstruct.domain.SimpleSource;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleSourceDestinationMapperIntegrationTest {

    private SimpleSourceDestinationMapper mapper = Mappers.getMapper(SimpleSourceDestinationMapper.class);

    @Test
    public void givenSourceToDestination_whenMaps_thenCorrect() {
        //given
        SimpleSource simpleSource = new SimpleSource("SourceName", "SourceDescription");

        //when
        SimpleDestination destination = mapper.sourceToDestination(simpleSource);

        //then
        assertEquals(simpleSource.getName(), destination.getName());
        assertEquals(simpleSource.getDescription(), destination.getDescription());
    }

    @Test
    public void givenDestinationToSource_whenMaps_thenCorrect() {
        //given
        SimpleDestination destination = new SimpleDestination("DestinationName", "DestinationDescription");

        //when
        SimpleSource source = mapper.destinationToSource(destination);
        //then
        assertEquals(destination.getName(), source.getName());
        assertEquals(destination.getDescription(), source.getDescription());
    }
}

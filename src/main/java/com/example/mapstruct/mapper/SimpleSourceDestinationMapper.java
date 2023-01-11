package com.example.mapstruct.mapper;

import com.example.mapstruct.domain.SimpleDestination;
import com.example.mapstruct.domain.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);
}

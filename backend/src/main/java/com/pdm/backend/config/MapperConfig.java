package com.pdm.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.ModelMapper;


@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper(){
       ModelMapper modelMapper =   new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper;
    }

}

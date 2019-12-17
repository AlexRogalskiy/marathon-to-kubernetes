package fr.insee.innovation.marathontokubernetes.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomObjectMapper {


    @Bean
    public ObjectMapper getMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper;
    }
}

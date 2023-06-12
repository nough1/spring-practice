package com.nou.mad.config.annotation;

import com.nou.mad.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationHelloWorld {



    @Bean
    public Person person(){
        return new Person();
    }


}

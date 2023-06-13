package com.nou.mad.config.annotation;

import com.nou.mad.config.annotation.importregister.MyImportRegister;
import com.nou.mad.config.annotation.importselector.MyImportSelector;
import com.nou.mad.model.ConfigurationInitBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.nou.mad")
@Import({MyImportSelector.class, MyImportRegister.class})
public class ConfigurationHelloWorld {

    @Bean
    public ConfigurationInitBean person(){
        return new ConfigurationInitBean();
    }


}

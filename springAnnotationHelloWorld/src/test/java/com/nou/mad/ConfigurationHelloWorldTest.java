package com.nou.mad;

import com.nou.mad.config.annotation.ConfigurationHelloWorld;
import com.nou.mad.controller.PersonController;
import com.nou.mad.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationHelloWorldTest {

    ApplicationContext applicationContext ;

    @Before
    public void beforeRun(){

        applicationContext = new AnnotationConfigApplicationContext(ConfigurationHelloWorld.class);

    }

    @Test
    public void testGetBean(){

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        ConfigurationHelloWorld configurationHelloWorld = applicationContext.getBean(ConfigurationHelloWorld.class);
        System.out.println(configurationHelloWorld);

        PersonController personController = applicationContext.getBean(PersonController.class);
        System.out.println(personController);

    }
}

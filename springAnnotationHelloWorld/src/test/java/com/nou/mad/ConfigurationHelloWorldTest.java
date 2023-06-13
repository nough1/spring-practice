package com.nou.mad;

import com.nou.mad.config.annotation.ConfigurationHelloWorld;
import com.nou.mad.controller.PersonController;
import com.nou.mad.model.ConfigurationInitBean;
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

       /* ConfigurationInitBean configurationInitBean = applicationContext.getBean(ConfigurationInitBean.class);
        System.out.println(configurationInitBean);

        ConfigurationHelloWorld configurationHelloWorld = applicationContext.getBean(ConfigurationHelloWorld.class);
        System.out.println(configurationHelloWorld);

        PersonController personController = applicationContext.getBean(PersonController.class);
        System.out.println(personController);*/

        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println("bean:"+beanDefinitionName+","+applicationContext.getBean(beanDefinitionName));
        }

    }
}

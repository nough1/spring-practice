package com.nou.mad.config.annotation.importregister;

import com.nou.mad.model.ImportRegisterBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportRegister implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ImportRegisterBean.class);
        registry.registerBeanDefinition("importRegisterBean",rootBeanDefinition);
    }
}

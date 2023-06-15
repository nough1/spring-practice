package com.nou.mad.factory;

import com.nou.mad.model.FactoryChild;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<FactoryChild> {

    public FactoryChild getObject() throws Exception {

        return new FactoryChild();

    }

    public Class<?> getObjectType() {
        return FactoryChild.class;
    }

    public boolean isSingleton() {
        return false;
    }
}

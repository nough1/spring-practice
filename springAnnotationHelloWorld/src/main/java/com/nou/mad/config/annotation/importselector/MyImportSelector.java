package com.nou.mad.config.annotation.importselector;

import com.nou.mad.model.ConfigurationInitBean;
import com.nou.mad.model.SelectImportBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        //System.out.println(SelectImportBean.class.getName());
        return new String[]{SelectImportBean.class.getName()};

    }
}

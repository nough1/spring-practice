package com.nou.mad.config.annotation.importselector;

import com.nou.mad.model.Person;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Person.class.getName()};
    }
}

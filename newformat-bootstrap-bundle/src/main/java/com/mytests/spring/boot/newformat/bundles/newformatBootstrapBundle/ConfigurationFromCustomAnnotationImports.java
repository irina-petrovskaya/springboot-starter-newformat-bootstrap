package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.BeanFromConfigurationFromCustomAnnotationImports;
import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
//@AutoConfiguration
public class ConfigurationFromCustomAnnotationImports {

    @Bean
    public BeanFromConfigurationFromCustomAnnotationImports beanFromConfigurationFromCustomAnnotationImports() {
        return new BeanFromConfigurationFromCustomAnnotationImports("bean from ConfigurationFromCustomAnnotationImports");
    }
}

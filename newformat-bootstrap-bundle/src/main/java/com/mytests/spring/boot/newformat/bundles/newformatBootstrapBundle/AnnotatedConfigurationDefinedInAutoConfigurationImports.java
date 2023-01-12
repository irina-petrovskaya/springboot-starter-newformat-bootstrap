package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.BeanFromAnnotatedConfigurationDefinedInAutoConfigurationImports;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
@Configuration //@AutoConfiguration
public class AnnotatedConfigurationDefinedInAutoConfigurationImports {
    @Bean
    public BeanFromAnnotatedConfigurationDefinedInAutoConfigurationImports beanFromAnnotatedConfigurationDefinedInAutoConfigurationImports() {
        return new BeanFromAnnotatedConfigurationDefinedInAutoConfigurationImports("bean from AnnotatedConfigurationDefinedInAutoConfigurationImports");
    }
}

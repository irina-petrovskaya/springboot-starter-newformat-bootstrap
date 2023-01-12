package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports;
import org.springframework.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
public class NotAnnotatedConfigurationDefinedInAutoConfigurationImports {

    @Bean
    public BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports beanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports() {
        return new BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports("bean from NotAnnotatedConfigurationDefinedInAutoConfigurationImports");
    }


}

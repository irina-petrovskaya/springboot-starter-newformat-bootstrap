package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.BeanFromConfigurationFromFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationFromFactories {
    @Bean
    public BeanFromConfigurationFromFactories beanFromConfigurationFromFactories() {
        return new BeanFromConfigurationFromFactories("bean from ConfigurationFromFactories");
    }
}

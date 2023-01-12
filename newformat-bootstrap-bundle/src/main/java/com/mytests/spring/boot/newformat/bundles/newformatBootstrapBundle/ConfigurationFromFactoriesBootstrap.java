package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.BeanFromConfigurationFromFactoriesBootstrap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


@Configuration
@Order
public class ConfigurationFromFactoriesBootstrap {
    @Bean
    public BeanFromConfigurationFromFactoriesBootstrap beanFromConfigurationFromFactoriesBootstrap() {
        return new BeanFromConfigurationFromFactoriesBootstrap("bean from ConfigurationFromFactoriesBootstrap");
    }
}

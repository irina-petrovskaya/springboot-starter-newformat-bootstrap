package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.extra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Properties;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Properties properties = new Properties();
        properties.put("myenvpostprocessor.key1","myenvpostprocessor_value1");
        properties.put("myenvpostprocessor.key2","myenvpostprocessor_value2");
        environment.getPropertySources().addLast(new PropertiesPropertySource("myproperties", properties));
    }
}

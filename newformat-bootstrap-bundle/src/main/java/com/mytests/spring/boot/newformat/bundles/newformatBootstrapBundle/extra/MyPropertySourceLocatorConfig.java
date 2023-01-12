package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.extra;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.Properties;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
@Order
public class MyPropertySourceLocatorConfig implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
        Properties localProps = new Properties();
        localProps.put("localProps.key1","localProps_value1");
        return new PropertiesPropertySource("localConfig", localProps);
    }
}

package com.mytests.spring.boot.newformat.bundles.useNewformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.*;
import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
@Component
public class UseBundleComponent {

    @Value("${myenvpostprocessor.key1}")
    String envPostProcessorTest;


    @Autowired(required = false)
    private ConfigurationFromFactories configurationFromFactories;
    @Autowired(required = false)
    private BeanFromConfigurationFromFactories beanFromConfigurationFromFactories;

    @Autowired(required = false)
    private ConfigurationFromFactoriesBootstrap configurationFromFactoriesBootstrap;
    @Autowired(required = false)
    private BeanFromConfigurationFromFactoriesBootstrap beanFromConfigurationFromFactoriesBootstrap;

    @Autowired(required = false)
    private AnnotatedConfigurationDefinedInAutoConfigurationImports annotatedConfigurationDefinedInAutoConfigurationImports;
    @Autowired(required = false)
    private BeanFromAnnotatedConfigurationDefinedInAutoConfigurationImports beanFromAnnotatedConfigurationDefinedInAutoConfigurationImports;

    @Autowired(required = false)
    private NotAnnotatedConfigurationDefinedInAutoConfigurationImports notAnnotatedConfigurationDefinedInAutoConfigurationImports;
    @Autowired(required = false)
    private BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports beanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports;

    @Autowired(required = false)
    private ConfigurationFromCustomAnnotationImports configurationFromCustomAnnotationImports;
    @Autowired(required = false)
    private BeanFromConfigurationFromCustomAnnotationImports beanFromConfigurationFromCustomAnnotationImports;


    @Autowired
    private Environment environment;

    public void displayAll() {
        System.out.println("================================================================");
        if (configurationFromFactories != null) {
            System.out.println(beanFromConfigurationFromFactories.toString());
        } else {
            System.out.println("configuration from spring.factories is not available");
        };
        if (configurationFromFactoriesBootstrap != null) {
            System.out.println(beanFromConfigurationFromFactoriesBootstrap.toString());
        } else {
            System.out.println("configuration from spring.factories bootstrap config is not available");
        };
        if (annotatedConfigurationDefinedInAutoConfigurationImports != null) {

            System.out.println(beanFromAnnotatedConfigurationDefinedInAutoConfigurationImports.toString());
        } else {
            System.out.println("annotated configuration from .imports is not available");
        }
        if (notAnnotatedConfigurationDefinedInAutoConfigurationImports != null) {

            System.out.println(beanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports.toString());
        } else {
            System.out.println("not annotated configuration from .imports is not available");
        }
        if (configurationFromCustomAnnotationImports != null) {

            System.out.println(beanFromConfigurationFromCustomAnnotationImports.toString());
        } else {
            System.out.println("configuration from custom .imports is not available");
        }
        System.out.println("================================================================");
        System.out.println("environmentPostProcessor test:");
        System.out.println(envPostProcessorTest);
        System.out.println("================================================================");
        System.out.println("propertySourceLocator test:");

        String pp = environment.getProperty("localProps.key1");
        if (pp != null) {
            System.out.println(pp);
        }else {
            System.out.println("not available");
        }
        System.out.println("================================================================");


    }

    ;
}

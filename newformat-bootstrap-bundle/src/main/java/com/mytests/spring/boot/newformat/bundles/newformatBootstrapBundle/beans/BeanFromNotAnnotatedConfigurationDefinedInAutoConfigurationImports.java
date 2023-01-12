package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans;

/**
 * *
 * <p>Created by irina on 1/11/2023.</p>
 * <p>Project: springboot-starter-newformat-bootstrap</p>
 * *
 */
public class BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports {

    String id;

    public BeanFromNotAnnotatedConfigurationDefinedInAutoConfigurationImports(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}

package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans;

public class BeanFromConfigurationFromFactories {

    String id;

    public BeanFromConfigurationFromFactories(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }
}
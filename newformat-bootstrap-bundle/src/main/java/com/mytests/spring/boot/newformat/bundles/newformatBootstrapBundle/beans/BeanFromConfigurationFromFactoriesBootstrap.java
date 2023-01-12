package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.beans;

public class BeanFromConfigurationFromFactoriesBootstrap {

    String id;

    public BeanFromConfigurationFromFactoriesBootstrap(String id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return id;
    }
}
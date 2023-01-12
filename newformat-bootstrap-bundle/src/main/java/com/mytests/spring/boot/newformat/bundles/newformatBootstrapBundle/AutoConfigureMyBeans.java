package com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle;

import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

import java.lang.annotation.*;

/**
 * *
 * <p>Created by irina on 5/31/2022.</p>
 * <p>Project: springboot-starter-newformat</p>
 * *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ImportAutoConfiguration
public @interface AutoConfigureMyBeans {
}

package com.mytests.spring.boot.newformat.bundles.useNewformatBootstrapBundle;

import com.mytests.spring.boot.newformat.bundles.newformatBootstrapBundle.AutoConfigureMyBeans;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigureMyBeans

public class UseNewformatBootstrapBundleApplication implements CommandLineRunner {

    private final UseBundleComponent useBundleComponent;

    public UseNewformatBootstrapBundleApplication(UseBundleComponent useBundleComponent) {
        this.useBundleComponent = useBundleComponent;
    }

    public static void main(String[] args) {
        SpringApplication.run(UseNewformatBootstrapBundleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      useBundleComponent.displayAll();
    }
}

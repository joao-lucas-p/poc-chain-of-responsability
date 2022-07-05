package com.joaopinho.pocchainofresponsability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PocChainOfResponsabilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocChainOfResponsabilityApplication.class, args);
    }

}

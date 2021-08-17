package com.revature.models.autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
class CarConfig {
    @Bean
    public Driver getDriver(@Qualifier("bmw") Drivable drivable) {
        return new Driver(drivable);
    }
}
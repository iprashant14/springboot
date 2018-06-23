package com.prashant.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping(path = "/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations(){
        LimitConfiguration limitConfiguration = new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
        return limitConfiguration;
    }

}

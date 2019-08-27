package com.pcitech.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class ConfigClientAdmin {
    @Value("${hello}")
    private String hello;



    @RequestMapping("/hello")
    public String from() {

        return hello + "_" ;
    }
}

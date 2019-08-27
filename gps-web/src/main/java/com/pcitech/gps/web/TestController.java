package com.pcitech.gps.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        logger.info("请求index方法！");
        return hello;
    }

    @Value("${hello}")
    private String hello;
}

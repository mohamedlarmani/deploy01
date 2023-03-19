package com.develhope.deploy01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${myCustomVarTree.devName}")
    private String devName;

    @GetMapping("/")
    public String name(){
        return devName;
    }
}

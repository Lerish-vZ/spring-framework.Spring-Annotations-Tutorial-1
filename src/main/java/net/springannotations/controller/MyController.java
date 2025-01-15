package net.springannotations.controller;

import org.springframework.stereotype.Controller;

@Controller//automatically create spring bean for class
public class MyController {

    public String hello(){
        return "Hello Controller";
    }
}

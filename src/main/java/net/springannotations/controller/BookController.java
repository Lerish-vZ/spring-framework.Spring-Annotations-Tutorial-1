package net.springannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//becomes a Spring MVC Controller
public class BookController {

    @RequestMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}

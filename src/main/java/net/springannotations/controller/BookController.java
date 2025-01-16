package net.springannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//becomes a Spring MVC Controller
public class BookController {

    @RequestMapping("/hello-world")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }
}

package net.springannotations.controller;

import net.springannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller//becomes a Spring MVC Controller
//@ResponseBody
@RestController //combination of @Controller & @ResponseBody
@RequestMapping("/api")// base URI
//Class
public class BookController {

    @RequestMapping("/hello-world") //Map incoming http request to this particular method
    //@ResponseBody //return type in Json format (@Controller & @ResponseBody)
    public String helloWorld(){
        return "Hello World";
    } //Handler methods
    //Above is how to use @RequestMapping for methods

    @RequestMapping(value = {"/book", "/core-java", "java"}) //multiple URI
    //@ResponseBody
    public Book getBook(){
        Book book = new Book(1, "Core Java", "Learn Core Java and Latest Features.");
        return book;
    }
}

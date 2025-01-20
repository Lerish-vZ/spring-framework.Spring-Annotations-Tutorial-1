package net.springannotations.controller;

import net.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


     @GetMapping(value = {"/book", "/java"})
//     // @RequestMapping(value = {"/book", "/core-java", "java"},//multiple URI
//     method = RequestMethod.GET//, //HTTP Methods
//            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, //Tells Rest API What type it has to return in this case Json
//            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    //@ResponseBody
    public Book getBook(){
        Book book = new Book(1, "Core Java", "Learn Core Java and Latest Features.");
        return book;
    }

    //@RequestMapping(value = "/book/create", method = RequestMethod.POST)
    @PostMapping(value = "/book/create",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    //@ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book){ //responsible to retrieve the jSon data from the request body and convert it into the book java object
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    } //Use postman to post a book in json format

    public ResponseEntity<Book> updateBook(int id, Book updatedBook){
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        
    }
}

package net.springannotations.service;

import org.springframework.stereotype.Service;

@Service //is special addition of @Component annotation
public class MyService {

    public String hello(){
        return "Hello Service";
    }
}

package net.springannotations.service;

import org.springframework.stereotype.Service;

@Service //is specialized annotation of @Component annotation
public class MyService {

    public String hello(){
        return "Hello Service";
    }
}

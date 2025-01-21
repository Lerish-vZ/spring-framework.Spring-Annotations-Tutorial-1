package net.springannotations.service;

import org.springframework.stereotype.Component;

//@Component
public class NonVegPizza implements Pizza{


    public String getPizza() {
        return "Non-veg Pizza";
    }
}

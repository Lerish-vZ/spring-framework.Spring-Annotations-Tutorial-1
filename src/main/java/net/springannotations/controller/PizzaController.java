package net.springannotations.controller;

import org.springframework.stereotype.Component;

@Component//("pizzaDemo")//"" is the spring name
//If you do not declare a bean name Spring automatically names the bean the class name with the first letter in lowercase
//indicates that an annotated class is a "spring bean/component". Tells Spring container to automatically create Spring bean.
public class PizzaController {

    public String getPizza(){
        return "Hot Pizza";
    }
}
 
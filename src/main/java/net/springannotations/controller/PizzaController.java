package net.springannotations.controller;

import net.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//("pizzaDemo")//"" is the spring name
//If you do not declare a bean name Spring automatically names the bean the class name with the first letter in lowercase
//indicates that an annotated class is a "spring bean/component". Tells Spring container to automatically create Spring bean.
public class PizzaController {
    private VegPizza vegPizza;

    @Autowired
    //tells spring container to automatically inject the vegPizza (above) with a bean using the constructor below
    public PizzaController(VegPizza vegPizza){
        this.vegPizza = vegPizza;
    }
    public String getPizza(){
        return vegPizza.getPizza();
    }
}
 
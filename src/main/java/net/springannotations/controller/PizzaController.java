package net.springannotations.controller;

import net.springannotations.service.Pizza;
import net.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("pizzaDemo")//"" is the spring name
//If you do not declare a bean name Spring automatically names the bean the class name with the first letter in lowercase
//indicates that an annotated class is a "spring bean/component". Tells Spring container to automatically create Spring bean.
public class PizzaController {
//    @Autowired //this is field injection
//    private VegPizza vegPizza;

    private Pizza pizza;

//    @Autowired
//    public PizzaController(Pizza pizza){
//        this.pizza = pizza;
//    }
    //@Primary annotation

//    @Autowired
//    public PizzaController(@Qualifier("vegPizza") Pizza pizza){
//        this.pizza = pizza;
//    }
    //@Qualifier annotation

//    @Autowired
//    //tells spring container to automatically inject the vegPizza (above) with a bean using the constructor below
//    public PizzaController(VegPizza vegPizza){
//        this.vegPizza = vegPizza;
//    }
    //constructor injection

//    @Autowired //tells spring container to inject this spring bean as a dependency with the bottom setter method
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }
    //setter injection

    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }
}
 
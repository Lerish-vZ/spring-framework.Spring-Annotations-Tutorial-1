package net.springannotations.service;

import net.springannotations.controller.PizzaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class VegPizza {
    private VegPizza vegPizza;

    @Autowired //tells spring container to automatically inject the vegPizza (above) with a bean using the constructor below
    public PizzaController(VegPizza vegPizza){
        this.vegPizza = vegPizza;
    }


    public String getPizza(){
        return vegPizza.getPizza();
    }
} 

package net.springannotations.service;

import net.springannotations.controller.PizzaController;
import org.springframework.stereotype.Component;

@Component

public class VegPizza {
    private VegPizza vegPizza;

    public PizzaController(VegPizza vegPizza){
        this.vegPizza = vegPizza;
    }


    public String getPizza(){
        return vegPizza.getPizza();
    }
} 

package net.springannotations.service;

import net.springannotations.controller.PizzaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class VegPizza {

    public String getPizza(){
        return "Veg Pizza";
    }
} 

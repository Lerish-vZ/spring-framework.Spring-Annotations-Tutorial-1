package net.springannotations;

import net.springannotations.controller.PizzaController;
import net.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
       PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
        System.out.println(pizzaController.getPizza());

//        VegPizza vegPizza = context.getBean(VegPizza.class); //can specify a bean name but default is the method name
//        System.out.println(vegPizza.getPizza());
    }

}

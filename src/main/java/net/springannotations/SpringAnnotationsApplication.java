package net.springannotations;

import net.springannotations.controller.MyController;
import net.springannotations.controller.PizzaController;
import net.springannotations.lazy.LazyLoader;
import net.springannotations.repository.MyRepository;
import net.springannotations.service.MyService;
import net.springannotations.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
//       PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//        System.out.println(pizzaController.getPizza());

      MyController myController = context.getBean(MyController.class);
      System.out.println(myController.hello());

      MyService myService = context.getBean(MyService.class);
      System.out.println(myService.hello());

        MyRepository myRepository = context.getBean(MyRepository.class);
        System.out.println(myRepository.hello());

        LazyLoader lazyLoader = context.getBean(LazyLoader.class);
        

//        VegPizza vegPizza = context.getBean(VegPizza.class); //can specify a bean name but default is the method name
//        System.out.println(vegPizza.getPizza());
    }  

}

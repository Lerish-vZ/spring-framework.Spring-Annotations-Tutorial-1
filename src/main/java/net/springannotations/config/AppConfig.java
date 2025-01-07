package net.springannotations.config;

import net.springannotations.service.Pizza;
import net.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //makes this class a configuration class
public class AppConfig { //within this configuration class we can define Spring bean definitions

    @Bean //Tells spring container to manage this vegPizza class object
    public Pizza vegPizza(){
        return new VegPizza();
    }
}

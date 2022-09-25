package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean
    //method name is the bean name
        // and it creates a bean named vehicle inside the context
   Vehicle vehicle1(){
       var veh=new Vehicle();
       veh.setName("Mercidez");
       return veh;
   }

   @Primary
   @Bean
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("BMW");
        return veh;
    }
   @Bean
   String string(){
        return "I love you Madhurima";
   }

}

package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    //method name is the bean name
        // and it creates a bean named vehicle inside the context
   Vehicle vehicle(){
       var veh=new Vehicle();
       veh.setName("Mercidez");
       return veh;
   }
   @Bean
   String string(){
        return "I love you Madhurima";
   }

}

package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages="com.example.beans")
public class ProjectConfigAnnotation {


    @Bean
    Vehicle vehicle1(){
        var v1=new Vehicle();
        v1.setName("Rolls Royce");
        return v1;
    }

    @Bean
    Vehicle vehicle2(){
        var v2=new Vehicle();
        v2.setName("Lamborghini");
        return v2;
    }

    @Bean
    Vehicle vehicle3(){
        var v3=new Vehicle();
        v3.setName("La Ferrari");
        return v3;
    }

}

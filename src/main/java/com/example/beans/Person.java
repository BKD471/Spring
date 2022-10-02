package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Bhaskar";
    //@Autowired
    private final Vehicle vehicle;

    // This type of autowiring(with constructor ) is recommended
    //since we can make vehicle bean as final only with this approach
    @Autowired
    public Person(@Qualifier("vehicle3") Vehicle vehicle2){
        System.out.println("Person Bean Created");
        this.vehicle=vehicle2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("I am "+ name);
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    //@Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}

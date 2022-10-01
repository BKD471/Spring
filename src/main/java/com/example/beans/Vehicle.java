package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name="Audi";

    public Vehicle(){
        System.out.println("Vehicle Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("I have "+name);
    }

    @Override
    public String toString() {
        return  name;

    }
}

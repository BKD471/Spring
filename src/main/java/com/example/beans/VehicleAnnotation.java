package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class VehicleAnnotation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Madhurima";
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Cleaning....");
    }

    public void display() {
        System.out.println("I will rise like a Phoenix");
    }

}

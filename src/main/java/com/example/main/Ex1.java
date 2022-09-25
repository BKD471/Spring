package com.example.main;

import com.example.beans.Vehicle;
import com.example.beans.VehicleAnnotation;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfigAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex1 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());

        String st = context.getBean(String.class);
        System.out.println(st);



        var contexts=new AnnotationConfigApplicationContext(ProjectConfigAnnotation.class);
        VehicleAnnotation v=contexts.getBean(VehicleAnnotation.class);
        v.display();
        System.out.println("I love You"+v.getName());
        contexts.close();
    }
}

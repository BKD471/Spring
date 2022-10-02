package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.beans.VehicleAnnotation;
import com.example.config.ProjectConfig;
import com.example.config.ProjectConfigAnnotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Ex1 {
    public static void main(String[] args) {
        /*var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println(veh.getName());

        String st = context.getBean(String.class);
        System.out.println(st);*/


//        var contexts = new AnnotationConfigApplicationContext(ProjectConfigAnnotation.class);
//        VehicleAnnotation v = contexts.getBean(VehicleAnnotation.class);
//        v.display();
//        System.out.println("I love You" + v.getName());
//        contexts.close();


        /*var contextRegisterBean = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> MercidezSupplier = () -> {
            Vehicle mercidez = new Vehicle();
            mercidez.setName("Mercidez Class C");
            return mercidez;
        };

        Vehicle audi = new Vehicle();
        audi.setName("Audi");
        Supplier<Vehicle> audiSupplier = () -> audi;


        Random random = new Random();
        int randomNumber = random.nextInt(10);

        Vehicle AudiVehicle = null;
        Vehicle MercidezVehicle = null;
        if ((randomNumber % 2) == 0) {
            contextRegisterBean.registerBean("Audi", Vehicle.class, audiSupplier);
        }else{
            contextRegisterBean.registerBean("Mercidez", Vehicle.class,MercidezSupplier);
        }


        try{
            AudiVehicle=contextRegisterBean.getBean("Audi", Vehicle.class);
        }catch(Exception e){
            System.out.println("Error in getting AUdi Bean");
        }

        try{
            MercidezVehicle=contextRegisterBean.getBean("Mercidez", Vehicle.class);
        }catch(Exception e){
            System.out.println("Error in getting Mercidez Bean");
        }

        if(AudiVehicle!=null) AudiVehicle.display();
        if(MercidezVehicle!=null) MercidezVehicle.display();*/


//        var autoContext=new AnnotationConfigApplicationContext(ProjectConfigAnnotation.class);
//        Vehicle vo=autoContext.getBean(Vehicle.class);
//        Person ps=autoContext.getBean(Person.class);
//        System.out.println("I am "+ps.getName());
//        System.out.println("Cr "+vo.getName());
//        System.out.println("I have "+ps.getVehicle());

        var multiBeanOfSameTypeContext = new AnnotationConfigApplicationContext(ProjectConfigAnnotation.class);
        Person p = multiBeanOfSameTypeContext.getBean(Person.class);
        System.out.println("I am " + p.getName());
        System.out.println("I have " + p.getVehicle());


    }
}


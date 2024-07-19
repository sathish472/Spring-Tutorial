package org.example.config;

import org.example.beans.Student;
import org.example.beans.Vehicle;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
public class ProjectConfig {

    @Bean(name = "Honda")
    @Lazy()
    @Scope()
    Vehicle vechile1(){
        Vehicle vehicle= new Vehicle();
        vehicle.setName("Honda");
        return  vehicle;
    }


    @Bean(value = "Activa")
    Vehicle vechile2(){
        Vehicle vehicle= new Vehicle();
        vehicle.setName("Activa");
        return  vehicle;
    }

    @Bean("Jeep")
    @Primary
    Vehicle vechile3(){
        Vehicle vehicle= new Vehicle();
        vehicle.setName("Jeep");
        return  vehicle;
    }

    @Bean
    String hello(){
        return "hello";
    }
    @Bean
    Integer number(){
        return 16;
    }

    @Bean("S1")
    Student getStudent(){
        return new Student(1, "Satish", vechile1());
    }
}

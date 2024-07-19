package org.example.main;

import org.example.beans.Student;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vechile=context.getBean("Honda",Vehicle.class);

        Student student = context.getBean("S1",Student.class);

        System.out.println("\n vehicle: "+vechile.getName());
    }
}

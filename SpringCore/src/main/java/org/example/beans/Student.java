package org.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

    var i;

    private int id;
    private String name;


    public Student(int id, String name, Vehicle v1){

        System.out.println("\n Student obj created id:"+id+" name:"+name +" Vechile: "+v1);
    }

    @p
    public void intialize(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.latihan;

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.printf("I'm %s, hello %s\n",this.name, name);
    }
}

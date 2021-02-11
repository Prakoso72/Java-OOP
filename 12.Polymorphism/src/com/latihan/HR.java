package com.latihan;

public class HR extends Person{
    HR(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.printf("I'm HR %s, hello %s\n",this.name,name);
    }

    void idc(String name){
        System.out.printf("I dont care with you %s ~ %s", name, this.name);
    }
}

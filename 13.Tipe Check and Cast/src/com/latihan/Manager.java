package com.latihan;

public class Manager extends Person{
    Manager(String name){
        super(name);
    }

    int getRespawn(){
        return 33;
    }

    void kendaraan(){
        System.out.println("Helikopter");
    }
}

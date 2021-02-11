package com.latihan;

public class HRD extends Person{
    HRD(String name){
        super(name);
    }

    int getRespawn(){
        return -25;
    }

    void kendaraan(){
        System.out.println("Mobil");
    }
}

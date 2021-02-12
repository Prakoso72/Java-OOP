package com.latihan;

public class Manager extends Person{
    private String divisi;

    Manager(String name){
        super(name);
    }

    int getRespawn(){
        return 33;
    }

    void kendaraan(){
        System.out.println("Helikopter");
    }

    String getDivisi(){
        return divisi;
    }

    void setDivisi(String divisi){
        this.divisi = divisi;
    }
}

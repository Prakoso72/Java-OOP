package com.latihan;

public class HRD extends Person{
    private String jabatan;

    HRD(String name){
        super(name);
    }

    int getRespawn(){
        return -25;
    }

    void kendaraan(){
        System.out.println("Mobil");
    }

    String getJabatan(){
        return jabatan;
    }

    void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
}

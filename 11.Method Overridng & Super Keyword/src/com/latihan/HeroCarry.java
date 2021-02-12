package com.latihan;

public class HeroCarry extends Hero{
    int critical;

    //Overriding
    void display(){
        System.out.println("name\t\t: " + name);
        System.out.println("critical\t: " + critical);
    }

    //Overriding
    int lvl(){
        return critical/10-2;
    }

    //Super Keyword untuk mengakses method atau field parrent class
    int getLvlParrent(){
        return super.lvl();
    }
}

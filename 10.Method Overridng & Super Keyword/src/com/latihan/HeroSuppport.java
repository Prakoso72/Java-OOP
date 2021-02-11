package com.latihan;

public class HeroSuppport extends Hero{
    int healing;

    //Overiding
    void display(){
         System.out.println("name\t\t: " + name);
         System.out.println("healing\t\t: " + healing);
    }

    //Overriding
    int lvl(){
        return healing/10-2;
    }

    //Super Keyword untuk mengakses method atau field parrent class
    int getLvlParrent(){
        return super.lvl();
    }
}

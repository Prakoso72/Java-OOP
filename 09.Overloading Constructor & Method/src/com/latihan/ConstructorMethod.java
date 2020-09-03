package com.latihan;

public class ConstructorMethod {
    private String name;
    private static int number;

    ConstructorMethod(String name){
        this.name = name;
        ConstructorMethod.number++;
    }

    ConstructorMethod(){
        ConstructorMethod.number++;
        this.name = "Player" + ConstructorMethod.number;
    }

    void show(){
        System.out.println("Name: " + this.name);
    }

}

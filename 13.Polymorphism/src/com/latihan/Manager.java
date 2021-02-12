package com.latihan;

public class Manager extends Person{
    Manager(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.printf("I'm manager %s, hello %s\n",this.name,name);
    }

    void bye(String name){
        System.out.printf("bye and have a great day %s ~ %s\n", name, this.name);
    }
}

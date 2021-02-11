package com.latihan;

public class Main {
    public static void main(String args[]) {
        Person mugiwara = new Person("Mugiwara");
        mugiwara.sayHello("Zoro");

        mugiwara = new HR("Luffy"); //polymorphism ke HR
        mugiwara.sayHello("Sanji"); //syarat harus ada super constructor
        //mugiwara.idc("Sanji"); tidak bisa, karena variabel mugiwara tetaplah object Person

        mugiwara = new Manager("Mugiwara no Luffy"); //polymorphism ke Manager
        mugiwara.sayHello("Nami"); //syarat harus ada super constructor
        //mugiwara.bye("Nami"); tidak bisa, karena variabel mugiwara tetaplah object Person
    }
}

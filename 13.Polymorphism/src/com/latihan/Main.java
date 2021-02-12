package com.latihan;

public class Main {
    public static void main(String args[]) {
        Person mugiwara = new Person("Mugiwara");
        mugiwara.sayHello("Zoro");
        helloPerson(mugiwara);

        mugiwara = new HR("Luffy"); //polymorphism ke HR
        mugiwara.sayHello("Sanji"); //syarat harus ada super constructor
        //mugiwara.idc("Sanji"); tidak bisa, karena variabel mugiwara tetaplah object Person
        helloPerson(mugiwara);

        mugiwara = new Manager("Mugiwara no Luffy"); //polymorphism ke Manager
        mugiwara.sayHello("Nami"); //syarat harus ada super constructor
        //mugiwara.bye("Nami"); tidak bisa, karena variabel mugiwara tetaplah object Person
        helloPerson(mugiwara);
    }

    static void helloPerson(Person person){
        System.out.println("Hello " + person.name);
    }

    static void helloManager(Manager manager){
        System.out.println("Hello " + manager.name);
    }

    static void helloHRD(HR hr){
        System.out.println("Hello " + hr.name);
    }

    /**
     * Dengan polymorphism, maka method helloManager dan helloHRD tidak perlu digunakan.
     */
}

package com.latihan;

class NonConstructor{
    String huruf;
    int angka;
}

class Constructor1 {
    String huruf;
    int angka;

    Constructor1(String inHuruf, int inAngka){
        huruf = inHuruf;
        angka = inAngka;
    }
}

class Constructor2{
    String huruf;
    int angka;

    Constructor2(String inHuruf, int inAngka){
        huruf = inHuruf;
        angka = inAngka;
        System.out.printf("String: %s\n",huruf);
        System.out.printf("Integer: %d\n",angka);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("CLass,Object, dan Constructor\n");

        System.out.println("NON CONSTRUCTOR\n");

        //nonConstructor
        NonConstructor class1 = new NonConstructor();
        class1.huruf = "String pada class1";
        class1.angka = 1;
        System.out.printf("String: %s\n",class1.huruf);
        System.out.printf("Integer: %d\n\n",class1.angka);

        System.out.println("CONSTRUCTOR METHOD\n");

        //Constructor print manual
        Constructor1 class2 = new Constructor1("Ini adalah String pada class ke-2", 2);
        System.out.printf("String: %s\n",class2.huruf);
        System.out.printf("Integer: %d\n\n",class2.angka);

        //Constructor print otomatis di class constructor
        Constructor2 class3 = new Constructor2("Dan ini ada pada class ke-3",3);
    }
}

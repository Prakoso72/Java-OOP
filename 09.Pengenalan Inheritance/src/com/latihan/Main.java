package com.latihan;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.name = "ini superclass";
        superClass.display();

        SubClass1 subClass1 = new SubClass1();
        subClass1.name = "ini subclass1";
        subClass1.display();

        SubClass2 subClass2 = new SubClass2();
        subClass2.name = "ini subclass2";
        subClass2.display();
    }
}

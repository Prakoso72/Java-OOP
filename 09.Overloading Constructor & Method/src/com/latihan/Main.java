package com.latihan;

public class Main {
    public static void main(String[] args) {
        ConstructorMethod object1 = new ConstructorMethod("Black Panther");
        ConstructorMethod object2 = new ConstructorMethod();
        ConstructorMethod object3 = new ConstructorMethod("Anti Mage");
        ConstructorMethod object4 = new ConstructorMethod();
        ConstructorMethod object5 = new ConstructorMethod();

        object1.show();
        object2.show();
        object3.show();
        object4.show();
        object5.show();

        int a = Methods.tambah(5,15);
        float b = Methods.tambah(1,0.998f);
        double c = Methods.tambah(1.2,2.8f);
        System.out.printf("\n%d\n%f\n%f",a,b,c);
    }
}

package com.latihan;

public class Main {
    public static void main(String[] args) {
        Person dendi = new HRD("Dendi");
        checkObjType(dendi); //tergantung instance walaupun tipe datanya Person
        HRD dendiHRD = (HRD) dendi;
        checkObjType(dendiHRD);
        Person artezy = new Manager("Artezy");
        checkObjType(artezy);
        Manager artezyManager = (Manager) artezy;
        checkObjType(artezyManager); //tergantung instance walaupun tipe datanya Person
        System.out.println();

        Person zoro = new Manager("Zoro");
        checkAndCast(zoro);
        Person sanji = new HRD("Sanji");
        checkAndCast(sanji);
    }

    static void checkObjType(Person person){
        if(person instanceof Manager) System.out.println(person.name + " is a Manager at my company");
        else if(person instanceof HRD) System.out.println(person.name + " is a HRD at my company");
        else System.out.println(person.name + " is a person");
    }

    static void checkAndCast(Person person){
        //aplikasi instanceof. Digunakan untuk mengecek instance sebelum dicasting
        if(person instanceof HRD){
            HRD hrd = (HRD) person; //casting digunakan untuk mengakses method ovriding
            System.out.println(hrd.name);
            System.out.println("Koordinat kantor HRD\t\t= " + hrd.getRespawn());
            System.out.print("kendaraan HRD\t\t\t\t= ");
            hrd.kendaraan();
        } else if(person instanceof Manager){
            Manager manager = (Manager) person; //casting digunakan untuk mengakses method ovriding
            System.out.println(manager.name);
            System.out.println("Koordinat kantor Manager\t= " + manager.getRespawn());
            System.out.print("kendaraan Manager\t\t\t= ");
            manager.kendaraan();
        } else{
            System.out.println("Person respawn\t\t\t= " + person.getRespawn());
            System.out.print("Memiliki ");
            person.kendaraan();
        }
    }
}

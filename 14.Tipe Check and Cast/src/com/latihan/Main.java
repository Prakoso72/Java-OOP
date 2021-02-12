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
        Person sanji = new HRD("Sanji");

//        zoro.setDivisi("Keuangan"); tidak bisa karena harus ada check instanceof terlebih dahulu
        if(zoro instanceof Manager){
            ((Manager) zoro).setDivisi("Keuangan"); //bukan overiding
        }
//        sanji.setJabatan; tidak bisa karena harus ada check instanceof terlebih dahulu
        if(sanji instanceof HRD){
            ((HRD) sanji).setJabatan("Wakil Ketua"); //bukan overiding
        }

        checkAndCast(zoro);
        checkAndCast(sanji);

        /**
         * cast digunakan untuk me-cast object ke tipe data object lain, sehingga object tersebut dapat
         * mengakses method pada instance terbaru baik method overiding ataupun method biasa. Selain
         * itu casting membuat tipe data berubah. Dapat dikatakan casting merubah variabel sepenuhnya
         * dan berbeda dengan polymorphism yang merubah instancenya saja
         */
    }

    static void checkObjType(Person person){
        if(person instanceof Manager) System.out.println(person.name + " is a Manager at my company");
        else if(person instanceof HRD) System.out.println(person.name + " is a HRD at my company");
        else System.out.println(person.name + " is a person");
    }

    static void checkAndCast(Person person){
        //aplikasi instanceof. Digunakan untuk mengecek instance sebelum dicasting
        if(person instanceof HRD){
            HRD hrd = (HRD) person; //casting, sehingga tipe data berubah ke HRD
            System.out.println(hrd.name);
            System.out.println("Koordinat kantor HRD\t\t= " + hrd.getRespawn());
            System.out.print("kendaraan HRD\t\t\t\t= ");
            hrd.kendaraan();
            System.out.println("Jabatan\t\t\t\t\t\t= " + hrd.getJabatan());
        } else if(person instanceof Manager){
            Manager manager = (Manager) person; //casting, sehingga tipe data berubah ke Manager
            System.out.println(manager.name);
            System.out.println("Koordinat kantor Manager\t= " + manager.getRespawn());
            System.out.print("kendaraan Manager\t\t\t= ");
            manager.kendaraan();
            System.out.println("Divisi\t\t\t\t\t\t= " + manager.getDivisi());
        } else{
            System.out.println("Person respawn\t\t\t= " + person.getRespawn());
            System.out.print("Memiliki ");
            person.kendaraan();
        }
    }
}

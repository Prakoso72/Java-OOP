package com.latihan;

class Mahasiswa{
    String nama;
    double IPK;

    Mahasiswa(String nama, double IPK){
        this.nama = nama;
        this.IPK = IPK;
    }

    void display(){
        System.out.println("Nama: " + this.nama);
        System.out.println("IPK : " + this.IPK);
    }
}

public class Main {

    public static void main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("Mozart", 3.8);
        //Akan tetap sama dengan mahasiswa1, karena assignment hanya akan menyamakan addressnya.
        //Sehingga untuk membuat data baru harus membuat object baru
        Mahasiswa mahasiswa2 = mahasiswa1;

        String address = Integer.toHexString(System.identityHashCode(mahasiswa1));
        System.out.println("\nMAHASISWA1");
        mahasiswa1.display();
        System.out.println(address);
        address = Integer.toHexString(System.identityHashCode(mahasiswa2));
        System.out.println("\nMAHASISWA2");
        mahasiswa2.display();
        System.out.println(address);

        System.out.println("\nMerubah nama & IPK");
        mahasiswa1.nama = "Dimas Kanjeng";
        mahasiswa2.IPK = 2.9;

        address = Integer.toHexString(System.identityHashCode(mahasiswa1));
        System.out.println("\nMAHASISWA1");
        mahasiswa1.display();
        System.out.println(address);
        address = Integer.toHexString(System.identityHashCode(mahasiswa2));
        System.out.println("\nMAHASISWA2");
        mahasiswa2.display();
        System.out.println(address);
    }
}

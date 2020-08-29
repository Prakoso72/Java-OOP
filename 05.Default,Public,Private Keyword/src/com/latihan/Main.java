package com.latihan;

class Buku{
    String judul; //default keyword (bisa baca & tulis di luar class)
    public short tahun; //public keyword (bisa baca & tulis di luar class)
    private String penulis; //private keyword (hanya bisa baca & tulis di dalam classnya)

    Buku(String judul, short tahun, String penulis){
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
    }

}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Bumi Manusia", (short) 2005,"Pramoedya Ananta Toer");

        System.out.println(buku1.judul);
        System.out.println(buku1.tahun);
        //System.out.println(buku1.penulis); //tidak bisa karena menggunakan private keyword

    }

}

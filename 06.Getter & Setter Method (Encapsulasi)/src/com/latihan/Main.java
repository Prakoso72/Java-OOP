package com.latihan;

import java.util.Scanner;

class Lingkaran {
    private double diameter;
    private double tinggiTabung;
    double pi = 3.1415926535897932384626;

    public Lingkaran(double diameter, double tinggiTabung){
        this.diameter = diameter;
        this.tinggiTabung = tinggiTabung;
    }

    //getter (nama method diawali dengan kata "get")
    public double getJari2(){
        return this.diameter/2;
    }

    //setter (nama method diawali dengan kata "set")
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    //getter
    int getLuas(){
        int luas = (int)((this.diameter/2)*(this.diameter/2)*this.pi);
        return luas;
    }

    //getter
    double getKeliling(){
        double keliling = this.diameter*this.pi;
        return keliling;
    }

    //getter
    public double getTinggiTabung(){
        return this.tinggiTabung;
    }

    //setter
    public void setTinggiTabung(double tinggiTabung){
        this.tinggiTabung = tinggiTabung;
    }

    //getter
    double getVolume(){
        return (this.diameter/2)*(this.diameter/2)*this.pi*this.tinggiTabung;
    }

    //getter
    double getLuasSelimutTabung(){
        return ((this.diameter/2)*(this.diameter/2)*this.pi)+(this.diameter*this.diameter*this.pi);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner terminalInput = new Scanner(System.in);

        Lingkaran lingkaran1 = new Lingkaran(26,100);

        System.out.println("\nKOMPONEN LINGKARAN\n");

        System.out.println("pi = " + lingkaran1.pi + "\n");

        System.out.println("Jari-jari lingkaran1 = " + lingkaran1.getJari2());

        System.out.print("Masukan jari-jari baru: ");
        double setJari2 = terminalInput.nextDouble();
        lingkaran1.setJari2(setJari2);
        double jari2 = lingkaran1.getJari2();
        System.out.println("Jari-jari lingkaran1 = " + jari2);

        System.out.println("\nLuas lingkaran1     = " + lingkaran1.getLuas());
        System.out.println("Keliling lingkaran1 = " + lingkaran1.getKeliling());

        //===================================================================================

        System.out.println("\nKOMPONEN TABUNG");
        System.out.println("\nTinggi tabung = " + lingkaran1.getTinggiTabung());

        System.out.print("Masukan tinggi tabung baru: ");
        double setTinggiTabung = terminalInput.nextDouble();
        lingkaran1.setTinggiTabung(setTinggiTabung);
        System.out.println("Tinggi tabung = " + lingkaran1.getTinggiTabung());

        System.out.println("\nVolume tabung lingkaran1       = " + lingkaran1.getVolume());
        System.out.println("Luas selimut tabung lingkaran1 = " + lingkaran1.getVolume());
    }
}

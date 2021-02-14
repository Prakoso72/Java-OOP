abstract class Hewan{
    String name;

    Hewan(String name){
        this.name = name;
    }

    /*
    abstract void berjalan(){
        System.out.println();
    }
     method abstract tidak diperbolehkan memiliki body atau harus deklarasi saja*/

    abstract void berpindah();
    abstract void berbicara();
    abstract int jumlahTanganKaki();

    /*
    Ketika terdapat method abstract pada parent class, maka pada child classnya harus
    overide method tersebut.
     */

    /*
    Abstract class merupakan semi interface. Abstract class masih memungkinkan terdapat
    method yang tidak abstract
     */
}

class Kucing extends Hewan{
    int tes=0;
    Kucing(String name) {
        super(name);
        System.out.println(tes);
    }

    Kucing(int saudaraKe){
        super("kucing ke-" + saudaraKe);
    }

    void berpindah(){
        System.out.println("Berjalan");
    }

    int berpindah(int langkah){
        return langkah*4;
    }

    void berbicara(){
        System.out.println("berbicara\t: Meong....");
    }

    int jumlahTanganKaki(){
        return 4;
    }
}

abstract class Anjing extends Hewan{
    Anjing(String name) {
        super(name);
    }

    //extends class abstract pada class abstract tidak diwajibkan overide abstract method
}

public class Main {
    public static void main(String[] args) {
        //Hewan hewan = new Hewan(); error, karena abstract class hanya dapat dijadikan parent class saja

        Hewan kucing1 = new Kucing("Choper"); //Polymorphism
        System.out.println(kucing1.name);
        System.out.print("Perpindahan\t: ");
        kucing1.berpindah();
        kucing1.berbicara();
        System.out.println("Jumlah kaki\t: " + kucing1.jumlahTanganKaki() + "\n");

        var kucing2 = new Kucing(2); //Polymorphism
        System.out.println(kucing2.name);
        System.out.println("Perpindahan\t: " + kucing2.berpindah(2));
        kucing2.berbicara();
        System.out.println("Jumlah kaki\t: " + kucing2.jumlahTanganKaki());
    }
}

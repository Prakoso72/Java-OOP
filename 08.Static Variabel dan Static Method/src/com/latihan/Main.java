package com.latihan;

import com.latihan.staticClass.Player;
import static com.latihan.staticClass.Player.PROCESSOR;
/*
dengan static import, maka untuk memanggil method PROCESSOR tidak perlu menuliskan
nama classnya terlebih dahulu.
 */

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Genos");
        Player player2 = new Player("Saitama");
        Player player3 = new Player("Tobirama");
        Player player4 = new Player("Distruptor");
        Player.Protagonist protagonist1 = new Player.Protagonist();
        /*
        dengan static keyword, maka inner class dapat dideklarasi secara langsung tanpa
        harus deklarasi outer classnya terlebih dahulu. Problemnya object Protagonist
        tidak bisa lagi mengakses outer classnya (Player class)
         */

        //static keyword membuat method atau field dapat diakses tanpa deklarasi object
        System.out.println("Jumlah Player = " + Player.getNumberOfPlayer());
        System.out.println("Name List: " + Player.showName());
        //System.out.println("Name List: " + player4.showName()); //bisa tapi tidak direkomendasikan
        System.out.println("static num = " + Player.num);
        System.out.println("Processors: " + PROCESSOR); //akibat dari static import
        System.out.println("Test Static Block: " + Player.numOfPlayerTest);

    }
}

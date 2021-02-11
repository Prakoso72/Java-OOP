package com.latihan;

public class Main {
    public static void main(String[] args) {
        HeroCarry slark = new HeroCarry();
        slark.name = "Slark";
        slark.critical = 93;
        slark.display();
        System.out.println("lvl overiding = " + slark.lvl() + ", lvl super = " + slark.getLvlParrent());
        System.out.println();

        HeroSuppport oracle = new HeroSuppport();
        oracle.name = "Oracle";
        oracle.healing = 59;
        oracle.display();
        System.out.println("lvl overiding = " + oracle.lvl() + ", lvl super = " + oracle.getLvlParrent());
    }
}

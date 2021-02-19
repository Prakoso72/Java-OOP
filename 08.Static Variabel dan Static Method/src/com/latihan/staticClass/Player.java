package com.latihan.staticClass;

import java.util.ArrayList;

public class Player {

    private static int numberOfPlayer; //dg static, numberOfPlayer dapat dimodifikasi melalui konstruktor
    private static ArrayList<String> nameList = new ArrayList<>();
    public static int num = 201;
    public static final int PROCESSOR;
    public static final int numOfPlayerTest;
    private String name;

    public Player(String name) {
        this.name = name;
        numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
        numOfPlayerTest = getNumberOfPlayer();
        /*
        Static block dieksekusi sebelum class dibentuk, sehingga dapat mengisi variabel atau
        method sebelum dibentuk dengan syarat harus static juga
         */
    }

    public static int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public static ArrayList<String> showName() {
        return Player.nameList;
    }

    public static class Protagonist {
        void tes() {
            System.out.println("tes");
        }
    }

}

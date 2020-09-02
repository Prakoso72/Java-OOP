package com.latihan;

import java.util.ArrayList;

class Player{

    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<>();

    private String name;

    Player(String name){
        this.name = name;
        numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    static int getNumberOfPlayer(){
        return numberOfPlayer;
    }

    static ArrayList<String> showName(){
        return Player.nameList;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Genos");
        Player player2 = new Player("Saitama");
        Player player3 = new Player("Tobirama");
        Player player4 = new Player("Distruptor");

        System.out.println("Jumlah Player = " + Player.getNumberOfPlayer());
        System.out.println("Name List: " + Player.showName());
        //System.out.println("Name List: " + player4.showName()); //bisa tapi tidak direkomendasikan

    }
}

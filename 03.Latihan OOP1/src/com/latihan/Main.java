package com.latihan;

import java.util.Scanner;

//User
class Player{
    String name;
    double healt;
    int level;
    double naturalAP;
    double naturalDP;
    Weapon weapon;
    Armor armor;

    Player(String name, double healt,double naturalAP,double naturalDP){
        this.name = name;
        this.healt = healt;
        this.naturalAP = naturalAP;
        this.naturalDP = naturalDP;
    }

    void attack(Player opponent){
        //object dapat digunakan hanya jika ada di dalam method
        double totalAP = totalAP(this.weapon.atackPower,this.naturalAP);
        System.out.println(this.name + " attacking " + opponent.name + " with AP --> " + totalAP);
        opponent.defence(totalAP);
    }

    void defence(double attackPower){
        double totalDP = totalDP(this.armor.defencePower,this.naturalDP);
        double damage = attackPower - totalDP;
        if(damage <= 0) {
            damage = 0;
        }
        System.out.println(this.name + " gets " + damage + " damage");
        System.out.println(this.name + " healt: " + (this.healt - damage) + " hp\n");
    }

    void weapon(Weapon weapon){
        this.weapon = weapon;
    }

    void armor(Armor armor){
        this.armor = armor;
    }

    double totalAP(double weapon, double naturalAP){
        return weapon + naturalAP;
    }

    double totalDP(double armor, double naturalDP){
        return armor + naturalDP;
    }

    void displayDetail(){
        double totalAP = totalAP(this.weapon.atackPower, this.naturalAP);
        double totalDP = totalDP(this.armor.defencePower, this.naturalDP);
        System.out.printf("Name         : %s\n",name);
        System.out.println("Healt        : " + healt);
        System.out.println("Attack Power : " + totalAP);
        System.out.println("Defence Power: " + totalDP + "\n");
    }
}

//Weapon
class Weapon{
    double atackPower;

    Weapon(double atackPower){
        this.atackPower = atackPower;
    }
}

//Armor
class Armor{
    double defencePower;

    Armor(double defencePower){
        this.defencePower = defencePower;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("            SIMULASI GAME");
        System.out.println("=====================================");

        Scanner input = new Scanner(System.in);

        //Weapon List
        Weapon bilnkDager = new Weapon(34.3);
        Weapon rappier = new Weapon(65.9);
        Weapon forceStaff = new Weapon(44.1);
        Weapon shadowBlade = new Weapon(55.9);
        Weapon handOfMidas = new Weapon(27.5);
        Weapon dagon = new Weapon(67.8);

        //Armor List
        Armor blackMail = new Armor(33.7);
        Armor mantleOfIntelligence = new Armor(18.4);
        Armor crimsonGuard = new Armor(44.5);
        Armor glimmerCape = new Armor(29.5);
        Armor assaultCuirass = new Armor(55.5);

        //Player
        Player player1 = new Player("Slark",276,20.5,5);
        Player player2 = new Player("Bounty Hunter",190.5,39.5,10);
        Player player3 = new Player("Pudge",555.5,12.5,2);
        Player player4 = new Player("Wind Ranger", 250.7,19,5);
        Player player5 = new Player("Pugna",250,5,5);

        //Player1 Equipment
        System.out.println("1");
        player1.weapon(rappier);
        player1.armor(crimsonGuard);
        player1.displayDetail();

        //Player2 Equipment
        System.out.println("2");
        player2.weapon(handOfMidas);
        player2.armor(blackMail);
        player2.displayDetail();

        //Player3 Equipment
        System.out.println("3");
        player3.weapon(bilnkDager);
        player3.armor(blackMail);
        player3.displayDetail();

        //Player4 Equipment
        System.out.println("4");
        player4.weapon(forceStaff);
        player4.armor(assaultCuirass);
        player4.displayDetail();

        //Player5 Equipment
        System.out.println("5");
        player5.weapon(dagon);
        player5.armor(mantleOfIntelligence);
        player5.displayDetail();

        if(getYesNo("Battle?")) {
            clearScreen();
            System.out.println("--------------------------------------------------");
            System.out.println("                      BATTLE");
            System.out.println("--------------------------------------------------");

            player1.attack(player5);
            player5.attack(player2);
            player2.attack(player4);
            player4.attack(player3);
            player3.attack(player1);
        }

    }

    public static void clearScreen(){

        try{
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else{
                System.out.print("\033\143");
            }
        } catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }

    public static boolean getYesNo(String massage){

        Scanner getYesNoInput = new Scanner (System.in);
        String pilihanUser;
        boolean pilihan;

        System.out.print("\n" + massage + " y/n : ");
        pilihanUser = getYesNoInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Wrong Keyword!");
            System.out.print("\n" + massage + " y/n : ");
            pilihanUser = getYesNoInput.next();
        }

        pilihan = pilihanUser.equalsIgnoreCase("y");
        System.out.println();

        return pilihan;
    }
}

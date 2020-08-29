package com.latihan;

class Player{
    //data member
    private String name;
    private int level;
    private int incrementAttack;
    private int incrementHealth;
    private int incrementDefence;
    private int baseHealt;
    private int basAttack;
    private int baseDefence;
    private Armor armor;
    private Weapon weapon;

    //constructor
    Player(String name, int baseHealt, int baseAttack,int incrementAttackDefence, int incrementHealth){
        this.name = name;
        this.basAttack = baseAttack;
        this.baseHealt = baseHealt;
        this.level = 1;
        this.incrementAttack = incrementAttackDefence;
        this.incrementDefence = incrementAttackDefence;
        this.incrementHealth = incrementHealth;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    int maxHealt(){
        return this.level*this.incrementHealth+this.baseHealt+this.armor.getHealtArmor();
    }

    int defence(){
        return this.baseDefence+this.armor.getDefenceArmor();
    }

    int attack(){
        return this.basAttack+this.weapon.getWeaponAttack();
    }

    void display(){
        System.out.println("Player Name\t: " + this.name);
        System.out.println("Healt\t\t: " + this.maxHealt());
        System.out.println("Defence\t\t: " + this.defence());
        System.out.println("Attack\t\t: " + this.attack() + "\n");
    }
}

class Armor{
    //data member
    private String name;
    private int defenceArmor;
    private int healtArmor;

    //constructor
    Armor(String name, int defenceArmor, int healtArmor){
        this.name = name;
        this.defenceArmor = defenceArmor;
        this.healtArmor = healtArmor;
    }

    //getter healtArmor
    public int getHealtArmor() {
        return healtArmor;
    }

    //getter defenceArmor

    public int getDefenceArmor() {
        return defenceArmor;
    }
}

class Weapon{
    //data member
    private String name;
    private int weaponAttack;

    //constructor
    Weapon(String name, int weaponAttack){
        this.name = name;
        this.weaponAttack = weaponAttack;
    }

    public int getWeaponAttack() {
        return weaponAttack;
    }
}

public class Main {
    public static void main(String[] args){

        //PLayer list
        Player player1 = new Player("Pudge",200,20,15,25);
        Player player2 = new Player("Wind Ranger", 98,22, 20,15);
        Player player3 = new Player("IO",150,16,11,20);
        Player player4 = new Player("Invoker",100,25,22,17);
        Player player5 = new Player("Riki",100,30,20,11);

        //Armor list
        Armor armor1 = new Armor("Assault Cuirass", 30,30);
        Armor armor2 = new Armor("Chainmail", 17,17);
        Armor armor3 = new Armor("Glimmer Cape",20,20);
        Armor armor4 = new Armor("Solar Crest", 25,25);
        Armor armor5 = new Armor("Crimson Guard", 28, 32);

        //Weapon list
        Weapon weapon1 = new Weapon("Shadow Blade",25);
        Weapon weapon2 = new Weapon("Hand of Midas", 15);
        Weapon weapon3 = new Weapon("Divine Rappier", 35);
        Weapon weapon4 = new Weapon("Desolator",25);
        Weapon weapon5 = new Weapon("Aghanim's Scepter", 30);

        //Player Equipment
        System.out.println("=======\nPlayer1\n=======");
        player1.setArmor(armor2);
        player1.setWeapon(weapon1);
        player1.display();
        System.out.println("=======\nPlayer2\n=======");
        player2.setArmor(armor4);
        player2.setWeapon(weapon4);
        player2.display();
        System.out.println("=======\nPlayer3\n=======");
        player3.setArmor(armor3);
        player3.setWeapon(weapon5);
        player3.display();
        System.out.println("=======\nPlayer4\n=======");
        player4.setArmor(armor1);
        player4.setWeapon(weapon2);
        player4.display();
        System.out.println("=======\nPlayer5\n=======");
        player5.setArmor(armor5);
        player5.setWeapon(weapon3);
        player5.display();

    }
}

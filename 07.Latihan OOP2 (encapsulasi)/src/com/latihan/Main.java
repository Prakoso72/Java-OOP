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
    private int totalDamage;
    private boolean isAlive;
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

    void attack(Player opponent){
        int damage = this.getAttack();
        System.out.printf("%s attacking %s with %d DP\n",this.name,opponent.name,damage);
        opponent.defence(damage);
        this.levelUp();
    }

    void defence(int damage){
        int deltaDamage;

        if(this.getDefence()<damage){
            deltaDamage = damage - this.getDefence();
        } else{
            deltaDamage = 0;
        }

        this.totalDamage += deltaDamage;

        System.out.println("Damage earned = " + deltaDamage + " DP");
        getHealt();
        if(getHealt()<=0){
            isAlive = false;
            this.totalDamage = this.maxHealt();
        }
        this.display();
    }

    private int getHealt(){
        return this.maxHealt()-this.totalDamage;
    }

    private void levelUp(){
        this.level++;
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

    int getDefence(){
        return this.armor.getDefenceArmor()+this.incrementDefence*this.level;
    }

    int getAttack(){
        return this.basAttack+this.weapon.getWeaponAttack()+this.incrementAttack*this.level;
    }

    void display(){
        System.out.println("Player Name\t\t: " + this.name);
        System.out.println("Level\t\t\t: " + this.level);
        System.out.println("Healt(HP)\t\t: " + this.getHealt() +"/"+ this.maxHealt());
        System.out.println("Defence(DP)\t\t: " + this.getDefence());
        System.out.println("Attack(AP)\t\t: " + this.getAttack() + "\n");
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
        System.out.println("\n++++++++++++++  +\nGAME SIMULATION\n+++++++++++++++\n");

        //PLayer list
        Player player1 = new Player("Pudge",200,20,10,25);
        Player player2 = new Player("Wind Ranger",98,22,15,15);
        Player player3 = new Player("IO",150,16,11,20);
        Player player4 = new Player("Invoker",100,25,18,17);
        Player player5 = new Player("Riki",100,24,22,11);

        //Armor list
        Armor armor1 = new Armor("Assault Cuirass",30,30);
        Armor armor2 = new Armor("Chainmail",17,17);
        Armor armor3 = new Armor("Glimmer Cape",20,20);
        Armor armor4 = new Armor("Solar Crest",25,25);
        Armor armor5 = new Armor("Crimson Guard",28,24);

        //Weapon list
        Weapon weapon1 = new Weapon("Shadow Blade",25);
        Weapon weapon2 = new Weapon("Hand of Midas",15);
        Weapon weapon3 = new Weapon("Divine Rappier",35);
        Weapon weapon4 = new Weapon("Desolator",25);
        Weapon weapon5 = new Weapon("Aghanim's Scepter",30);

        //Player Equipment
        System.out.println("=======\nPlayer1\n=======");
        setPlayerEquipment(player1,armor2,weapon1);
        player1.display();
        System.out.println("=======\nPlayer2\n=======");
        setPlayerEquipment(player2,armor4,weapon4);
        player2.display();
        System.out.println("=======\nPlayer3\n=======");
        setPlayerEquipment(player3,armor3,weapon5);
        player3.display();
        System.out.println("=======\nPlayer4\n=======");
        setPlayerEquipment(player4,armor1,weapon2);
        player4.display();
        System.out.println("=======\nPlayer5\n=======");
        setPlayerEquipment(player5,armor5,weapon3);
        player5.display();

        player5.attack(player4);//bisa mengakses private member
        player5.attack(player4);
        player5.attack(player4);
        player5.attack(player4);
        player5.attack(player4);

    }

    private static void setPlayerEquipment(Player player, Armor armor, Weapon weapon){
        player.setArmor(armor);
        player.setWeapon(weapon);
    }
}

package com.videogamecompany;

public class Warrior extends PersonsOfSkyrim {
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength){
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.shieldStrength = shieldStrength;
    }

    public void attackAnotherCharacter(){}

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public static void Display() {
        String strength = String.valueOf(75);
        String health = String.valueOf(100);
        String stamina = String.valueOf(100);
        String speed = String.valueOf(50);
        String attackPower = String.valueOf(10);
        String running = String.valueOf(false);
        String arrested = String.valueOf(false);
        String shieldStrength = String.valueOf(100);

        System.out.println("Strength initialValue = " + strength);
        System.out.println("Health initialValue = " + health);
        System.out.println("Stamina initialValue = " + stamina);
        System.out.println("Speed initialValue = " + speed);
        System.out.println("AttackPower initialValue = " + attackPower);
        System.out.println("Running initialValue = " + running);
        System.out.println("Arrested initialValue = " + arrested);
        System.out.println("Shield Strength initialValue = " + shieldStrength);


    }

    public static void main(String[] args) {
        System.out.println("Displaying the initial values for the Warrior...");
        Display();
    }
}

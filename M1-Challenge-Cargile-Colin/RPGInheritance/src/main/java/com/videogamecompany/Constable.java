package com.videogamecompany;

public class Constable extends PersonsOfSkyrim {

    private boolean jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean jurisdiction){
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = isJurisdiction();
    }

    protected void arrestAnotherCharacter(){}
    public void attackAnotherCharacter(){}

    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public static void Display() {
        String strength = String.valueOf(60);
        String health = String.valueOf(100);
        String stamina = String.valueOf(60);
        String speed = String.valueOf(20);
        String attackPower = String.valueOf(5);
        String running = String.valueOf(false);
        String arrested = String.valueOf(false);
        String jurisdiction = String.valueOf(true);

        System.out.println("Strength initialValue = " + strength);
        System.out.println("Health initialValue = " + health);
        System.out.println("Stamina initialValue = " + stamina);
        System.out.println("Speed initialValue = " + speed);
        System.out.println("AttackPower initialValue = " + attackPower);
        System.out.println("Running initialValue = " + running);
        System.out.println("Arrested initialValue = " + arrested);
        System.out.println("Jurisdiction initialValue = " + jurisdiction);

    }

    public static void main(String[] args) {
        System.out.println("Displaying the initial values for the Constable...");
        Display();
    }
}



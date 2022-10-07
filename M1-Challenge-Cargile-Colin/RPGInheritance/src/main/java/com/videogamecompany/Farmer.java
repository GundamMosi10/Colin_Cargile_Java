package com.videogamecompany;

public class Farmer extends PersonsOfSkyrim {
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting){
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public void attackAnotherCharacter(){}

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    public static void Display() {
            String strength = String.valueOf(75);
            String health = String.valueOf(100);
            String stamina = String.valueOf(75);
            String speed = String.valueOf(10);
            String attackPower = String.valueOf(1);
            String running = String.valueOf(false);
            String arrested = String.valueOf(false);
            String plowing = String.valueOf(false);
            String harvesting = String.valueOf(false);

            System.out.println("Strength initialValue = " + strength);
            System.out.println("Health initialValue = " + health);
            System.out.println("Stamina initialValue = " + stamina);
            System.out.println("Speed initialValue = " + speed);
            System.out.println("AttackPower initialValue = " + attackPower);
            System.out.println("Running initialValue = " + running);
            System.out.println("Arrested initialValue = " + arrested);
            System.out.println("Plowing initialValue = " + plowing);
            System.out.println("Harvesting initialValue = " + harvesting);
    }

    public static void main(String[] args) {
        System.out.println("Displaying the initial values for the Farmer...");
        Display();
    }
}


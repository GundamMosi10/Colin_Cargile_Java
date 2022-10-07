package com.company.pointofsale.IceCream;

import java.util.Objects;

public class iceCream {
    private String flavor;
    private float price;
    private int quantity;
    private String ingredients;
    private int numOfScoops;
    private boolean storeOpen;

    private boolean hasSprinkles;

    private boolean hasChocolateSyrup;

    private boolean inACupOrCone;

    private int quantityOfEmployees;


    public iceCream(String flavor, float price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public void setStoreToOpen(boolean storeOpen) {
        this.storeOpen = true;
    }

    public void allergicTo() {
        System.out.println("This Customer is allergic to " + ingredients);
    }

    public void useCoupon() {
        System.out.println("This Customer gets a discount on " + flavor + price);
    }

    public void increaseNumOfScoops() {
        System.out.println("Increase this customers scoops of ice cream by " + numOfScoops++);
    }

    public void setHasSprinkles() {
        if (this.hasSprinkles) {
            System.out.println("You are AWESOME");
        } else {
            System.out.println("That's kind of boring, you SHOULD ass sprinkles");
        }
    }

    public void setHasChocolateSyrup() {
        if (this.hasSprinkles) {
            System.out.println("You know what you like, respect");
        } else {
            System.out.println("Its okay you don't have to be awesome today");
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iceCream iceCream = (iceCream) o;
        return Float.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity);
    }

    @Override
    public String toString() {
        return "iceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

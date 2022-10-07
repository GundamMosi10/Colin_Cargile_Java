package com.company.factory.IceCream;

import java.util.Objects;

public class iceCream {
    private String flavor;
    private float salePrice;
    private float productionCost;
    private float productionTime;
    private String ingredients;

    private float shippingTime;

    private int numberOfGallonsOfIceCream = 1000;

    private int numberOfIceCreamTrucks = 15;
    private static int numberOfEmployees = 15;


    public iceCream(String flavor, float salePrice, float productionCost, float productionTime, String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public static int howManyEmployeesAreThere() {
        return numberOfEmployees;
    }

    public String generateIceCreamDescription() {
        return this.flavor + " is made with the finest " + this.ingredients + "and it will take us " + productionTime + "to make";
    }

    public void costToRunCompany() {
        if (this.productionCost < 20000) {
            System.out.println("We are screwed");
        } else if (this.productionCost >= 25000) {
            System.out.println("We are surviving in NYC");
        } else {
            System.out.println("WE ARE ROLLING IN THE DOUGH!");
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public float getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
    }

    public float getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(float productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        iceCream iceCream = (iceCream) o;
        return Float.compare(iceCream.salePrice, salePrice) == 0 && Float.compare(iceCream.productionCost, productionCost) == 0 && Float.compare(iceCream.productionTime, productionTime) == 0 && Objects.equals(flavor, iceCream.flavor) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, salePrice, productionCost, productionTime, ingredients);
    }

    @Override
    public String toString() {
        return "iceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}

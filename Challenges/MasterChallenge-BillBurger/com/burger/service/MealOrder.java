package com.burger.service;

import com.burger.model.*;


public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("REGULAR", "COKE", "FRIES");
    }

    public MealOrder(String burger, String drink, String side){
        String burgerName = (burger == null || burger.isBlank()) ? "REGULAR" : burger;
        String drinkName = (drink == null || drink.isBlank()) ? "COKE" : drink;
        String sideName = (side == null || side.isBlank()) ? "FRIES" : side;

        this.burger = (burgerName.equalsIgnoreCase("deluxe")) ?
                new DeluxeBurger(burgerName, 8.50) : new Burger(burgerName, 5);
        this.drink = new Item(drinkName, "DRINK", 2);
        this.side = new Item(sideName, "SIDE", 3);
    }

    public void addToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addToppings(String extra1, String extra2, String extra3, String deluxe1,
                            String deluxe2){
        if(burger instanceof DeluxeBurger deluxeBurger){
            deluxeBurger.addToppings(extra1, extra2, extra3, deluxe1, deluxe2);
        }
        else{
            System.out.println("Only upto 3 toppings allowed for regular burger");
        }
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    public void setSideSize(String size){
        side.setSize(size);
    }

    public void printItemizedList(){

        System.out.println("========================================");
        System.out.println("        BURGER SHOP - RECEIPT");
        System.out.println("========================================");
        System.out.printf("%-28s %10s%n", "ITEM", "AMOUNT ($)");
        System.out.println("----------------------------------------");

        burger.printItem();
        drink.printItem();
        side.printItem();

        System.out.println("----------------------------------------");
    }
    public void printTotal(){
        double total = burger.getAdjustedPrice() + drink.getAdjustedPrice()
                + side.getAdjustedPrice();

        System.out.printf("%-28s %10.2f%n", "TOTAL", total);
        System.out.println("========================================");
        System.out.println();
    }

}

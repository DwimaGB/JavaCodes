package com.burger.model;

public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price){
        super( name, "BURGER", price);
    }

    public void addToppings(String extra1, String extra2, String extra3){

        //all toppings price is 1
        if(extra1 != null){
            this.extra1 = new Item(extra1, "Topping", 1);
        }
        if(extra2 != null){
            this.extra2 = new Item(extra2, "Topping", 1);
        }
        if(extra3 != null){
            this.extra3 = new Item(extra3, "Topping", 1);
        }

    }

    @Override
    public double getAdjustedPrice(){

        double total = super.getBasePrice();

        if(extra1 != null) total += extra1.getBasePrice();
        if(extra2 != null) total += extra2.getBasePrice();
        if(extra3 != null) total += extra3.getBasePrice();

        return total;

    }

    @Override
    public void printItem(){

        // Receipt-style: show the burger base line, then indent toppings.
        System.out.printf("%-28s %10.2f%n", String.format("BURGER (%s)", super.getName()), super.getBasePrice());
        if(extra1 != null){
            System.out.printf("  %-26s %10.2f%n", "+ " + extra1.getName(), extra1.getAdjustedPrice());
        }
        if(extra2 != null){
            System.out.printf("  %-26s %10.2f%n", "+ " + extra2.getName(), extra2.getAdjustedPrice());
        }
        if(extra3 != null){
            System.out.printf("  %-26s %10.2f%n", "+ " + extra3.getName(), extra3.getAdjustedPrice());
        }
    }
}

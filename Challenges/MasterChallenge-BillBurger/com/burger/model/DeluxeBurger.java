package com.burger.model;

public class DeluxeBurger extends Burger {

    private Item deluxe1;
    private Item deluxe2;

    public DeluxeBurger(String type, double price){
        super(type, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String deluxe1,
                            String deluxe2){
        super.addToppings(extra1, extra2, extra3);

        if(deluxe1 != null){
            this.deluxe1 = new Item(deluxe1, "TOPPING", 0); // extra toppings free for deluxe
        }
        if(deluxe2 != null){
            this.deluxe2 = new Item(deluxe2, "TOPPING", 0);
        }
    }

    @Override
    public double getAdjustedPrice(){

        double total = super.getAdjustedPrice();

        if(deluxe1 != null) total += deluxe1.getBasePrice();
        if(deluxe2 != null) total += deluxe2.getBasePrice();

        return total;

    }

    @Override
    public void printItem(){
        super.printItem();

        if(deluxe1 != null){
            System.out.printf("  %-26s %10.2f%n", "+ " + deluxe1.getName(), deluxe1.getAdjustedPrice());
        }
        if(deluxe2 != null){
            System.out.printf("  %-26s %10.2f%n", "+ " + deluxe2.getName(), deluxe2.getAdjustedPrice());
        }
    }
}
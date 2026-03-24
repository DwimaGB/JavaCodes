package com.burger;

import com.burger.service.MealOrder;

public class Main {
    public static void main(String[] args) {

        MealOrder meal1 = new MealOrder();

        meal1.addToppings("CHEESE", "BACON", "ONION");
        meal1.setDrinkSize("LARGE");
        meal1.setSideSize("HALF");
        meal1.printItemizedList();
        meal1.printTotal();

        MealOrder meal2 = new MealOrder(
                "regular",   // burger
                "coke",      // drink
                "fries"      // side
        );

        // add up to 3 toppings
        meal2.addToppings("CHEESE", "BACON", null);
        meal2.setDrinkSize("LARGE");
        meal2.setSideSize("FULL");
        // print everything
        meal2.printItemizedList();
        meal2.printTotal();

        // Create a deluxe meal
        MealOrder deluxeMeal = new MealOrder("deluxe", "Coke", "Fries");

        // Add up to 5 toppings (all included in price)
        deluxeMeal.addToppings("Cheese", "Mayo", "Lettuce", "Onion", "Tomato");
        deluxeMeal.setSideSize("HALF");

        // Print bill
        deluxeMeal.printItemizedList();
        deluxeMeal.printTotal();
    }

}
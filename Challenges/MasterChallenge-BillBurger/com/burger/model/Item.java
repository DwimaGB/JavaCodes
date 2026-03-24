package com.burger.model;

public class Item {

    private String name;
    private String type;
    private double price;
    private String size;

    // always specify the item's name + type + base price, and optionally size.
    // In this app, drinks and sides can use size for pricing, but other items can still store a size.
    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    // Convenience overload when size doesn't matter (or should default).
    public Item(String name, String type, double price) {
        this(name, type, price,
                (type != null && type.equalsIgnoreCase("drink")) ? "SMALL" :
                        (type != null && type.equalsIgnoreCase("side")) ? "FULL" :
                                "NONE");
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getSize(){
        return size;
    }

    public double getBasePrice(){
        return price;
    }

    public void setSize(String size){
        this.size = size;
    }

    public double getAdjustedPrice() {

        if (type.equalsIgnoreCase("drink")) {
            String normalizedSize = (size == null) ? "" : size.toLowerCase();
            return switch (normalizedSize) {
                case "small" -> 2;
                case "medium" -> 2.5;
                case "large" -> 3;
                default -> price;
            };
        }

        if (type.equalsIgnoreCase("side")) {
            String normalizedSize = (size == null) ? "" : size.toLowerCase();
            return switch (normalizedSize) {
                case "half" -> price / 2;
                case "full" -> price;
                default -> price;
            };
        }


        return price;
    }

    public void printItem(){

        if(type.equalsIgnoreCase("drink")){
            String label = String.format("DRINK %s (%s)", this.getName(), this.getSize());
            System.out.printf("%-28s %10.2f%n", label, this.getAdjustedPrice());
        }
        else if(type.equalsIgnoreCase("side")){
            String label;
            if (size != null && !size.isBlank() && !size.equalsIgnoreCase("none")) {
                label = String.format("SIDE %s (%s)", this.getName(), this.getSize());
            } else {
                label = String.format("SIDE %s", this.getName());
            }
            System.out.printf("%-28s %10.2f%n", label, this.getAdjustedPrice());
        }
        else if(type.equalsIgnoreCase("topping")){
            String label = String.format("TOPPING %s", this.getName());
            System.out.printf("%-28s %10.2f%n", label, this.getAdjustedPrice());
        }
        else {
            // Fallback for any other item types.
            String label = String.format("%s %s", this.getType(), this.getName());
            System.out.printf("%-28s %10.2f%n", label, this.getAdjustedPrice());
        }
    }

}
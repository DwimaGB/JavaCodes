public class SmartKitchen {

    CoffeeMaker coffeeMaker;
    DishWasher dishWasher;
    Refrigerator refrigerator;

//    public SmartKitchen(CoffeeMaker coffeeMaker, DishWasher dishWasher,
//                        Refrigerator refrigerator){
//        this.coffeeMaker = coffeeMaker;
//        this.dishWasher  = dishWasher;
//        this.refrigerator = refrigerator;
//    }
    public  SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        refrigerator = new Refrigerator();
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public  void doKitchenWork(){
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();
    }

}

public class Main {
    public static void main(String[] args) {

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);
    }

    public static void runRace(Car car){

        car.startEngine();
        car.drive();
    }
}
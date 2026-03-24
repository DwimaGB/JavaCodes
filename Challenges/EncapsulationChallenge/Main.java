public class Main {
    public static void main(String[] args) {

        Printer printer1 = new Printer(50, false);
        System.out.println(printer1.addToner(30)); // expect 80
        System.out.println(printer1.printPages(5)); // expect 5 sheets

        Printer printer2 = new Printer(60, true);
        System.out.println(printer2.printPages(4));

        Printer printer3 = new Printer(60, true);
        System.out.println(printer3.printPages(5));

        Printer printer4 = new Printer(90, false);
        System.out.println(printer4.addToner(20));
    }
}
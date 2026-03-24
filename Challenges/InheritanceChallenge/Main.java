public class Main {
    public static void main(String[] args) {
        Employee dwima = new Employee("Dwima", "15/08/2003",
                 "01/01/25");
        System.out.println(dwima);
        System.out.println("Age = " + dwima.getAge());
        System.out.println("pay = " + dwima.collectPay());

        SalariedEmployee joe = new SalariedEmployee("joe", "15/01/2003",
                "03/03/25", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
    }
}
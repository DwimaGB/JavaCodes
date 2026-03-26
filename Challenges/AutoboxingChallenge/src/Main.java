public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");

        // Add customers
        System.out.println(bank.addCustomer("John"));   // true
        System.out.println(bank.addCustomer("Jane"));   // true
        System.out.println(bank.addCustomer("John"));   // false (duplicate)

        // Add transactions
        System.out.println(bank.addTransaction("John", 1000));  // true
        System.out.println(bank.addTransaction("John", -200));  // true
        System.out.println(bank.addTransaction("Jane", 500));   // true
        System.out.println(bank.addTransaction("Mike", 300));   // false (not found)

        // Print statements
        System.out.println("\n--- Statements ---");
        bank.printStatement("John");
        bank.printStatement("Jane");
        bank.printStatement("Mike");  // should fail or show nothing
    }
}
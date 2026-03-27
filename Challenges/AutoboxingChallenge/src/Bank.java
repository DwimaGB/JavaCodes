import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
    }

    public boolean addCustomer(String customerName){
        return addCustomer(new Customer(customerName));
    }

    public boolean addCustomer(Customer customer){
        if(findCustomer(customer.getName()) != null) return false;

        customers.add(customer);
        return true;
    }

    public boolean addTransaction(String customerName, double amount){

        Customer customer = findCustomer(customerName);

        if(customer == null) return false;

        customer.addTransaction(amount);
        return true;

    }

    private Customer findCustomer(String name){

        for(Customer c : customers){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }

    public void printStatement(String customerName){

        Customer customer = findCustomer(customerName);

        if(customer == null) {
            System.out.println("Customer with name " + customerName + " doesn't exist!");
            return;
        }

        var transactions = customer.getTransactions();

        System.out.println("Statement for " + customerName);

        int count = 1;
        for(double t : transactions){ // Autounboxing
            System.out.printf("Transaction %d: %.2f %s %n", count++, t, (t < 0)? "Debited" : "Credited");
        }
    }
}

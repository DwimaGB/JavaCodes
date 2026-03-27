
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String name){

        Branch branch = findBranch(name);

        if(branch != null) return false;

        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){

        Branch branch = findBranch(branchName);

        if(branch == null) return false;

        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){

        Branch branch = findBranch(branchName);

        if(branch == null) return false;

        return branch.addCustomerTransaction(customerName, amount);

    }

    private Branch findBranch(String name){

        for(Branch branch : branches){
            if(branch.getName().equalsIgnoreCase(name)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean isPrintTransactions){

        Branch branch = findBranch(name);

        if(branch == null) return false;

        var customers = branch.getCustomers();
        System.out.println("Customer details for branch " + branch.getName());

        int countCustomers = 1;
        for(Customer customer : customers){
            System.out.printf("Customer: %s[%d]%n", customer.getName(), countCustomers++);
            if(isPrintTransactions){
                var transactions = customer.getTransactions();
                int countTransactions = 1;
                System.out.println("Transactions");
                for(double t : transactions){
                    System.out.printf("[%d] Amount %.2f%n", countTransactions++, t);
                }
            }
        }
        return true;

    }
}

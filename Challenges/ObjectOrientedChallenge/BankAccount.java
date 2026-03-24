public class BankAccount {
 
//  states
 
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;
 
//  getters
 
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
 
//  setters
 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
 
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
 
    //  behaviors
 
    public void deposit(double amount){
 
        if(amount <= 0){
            System.out.println("Invalid Amount!");
            return;
        }
        accountBalance += amount;
        System.out.printf("Deposit Successful. Balance: $%.2f%n", accountBalance);
    }
 
    public boolean withdraw(double amount){
 
        if(amount <= 0){
            System.out.println("Invalid Amount!");
            return false;
        }
 
        if(accountBalance < amount){
            System.out.println("Insufficient Funds!");
            return false;
        }
        accountBalance -= amount;
        System.out.printf("Withdrawal Successful. Balance: $%.2f%n", accountBalance);
 
        return true;
    }
}
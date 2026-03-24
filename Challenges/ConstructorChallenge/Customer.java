public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        this("Customer name", "customer@mail.com");
    }
    public Customer(String name, String email){
        this(name, 1000.0, email);
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getCreditLimit(){
        return creditLimit;
    }


}

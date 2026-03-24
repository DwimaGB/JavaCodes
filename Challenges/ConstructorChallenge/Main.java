public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        Customer c2 = new Customer("Alice", "alice@mail.com");
        Customer c3 = new Customer("Bob", 5000, "bob@mail.com");

        System.out.println(c1.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c3.getEmail());
    }
}
import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean hasNumber = false;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");

            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                hasNumber = true;

                if (num < min) min = num;
                if (num > max) max = num;

            } else {
                sc.next();   // consume invalid token
                break;
            }
        }
        if (hasNumber) {
            System.out.println("Min = " + min + ", Max = " + max);
        } else {
            System.out.println("No valid numbers entered.");
        }
        sc.close();
    }
}
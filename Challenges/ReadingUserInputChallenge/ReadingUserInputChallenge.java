import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args){
        int countValid = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while(countValid <= 5){
            try{
                System.out.println("Enter number" + " #" + countValid);
                int num = sc.nextInt();
                sum += num;
                countValid++;

            }catch(InputMismatchException e){
                System.out.println("Invalid Input");
                sc.nextLine();   // clear the wrong input
            }
        }
        System.out.println("Sum = " + sum);
    }


}

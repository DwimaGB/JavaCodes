import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        double sum = 0;
        double avg;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            // System.out.print("Enter a number: ");
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            else{
                sc.next();
                break;
            }
        }
        try{
            avg = Math.round(sum/count);
        }catch(ArithmeticException e){
            avg = 0;
        }
        System.out.println("SUM = " + (int)sum + " AVG = " + (int)avg);
    }
}
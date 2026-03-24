import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        while(true){ // Ask user until user enters valid list of integers
            int[] arr = readIntegers(sc);
            if(arr.length > 0){
                System.out.println(Arrays.toString(arr));
                System.out.printf("Minimum Value: %d%n", findMin(arr));
                break;
            }
        }
 
    }
 
    public static int[] readIntegers(Scanner sc){
 
        System.out.print("Enter valid integers seperated by commas(,): ");
        String intStr = sc.nextLine();
        String[] intStrArray = intStr.split(",");
        int size = intStrArray.length;
        int[] intArray = new int[size];
 
        for(int i = 0; i < size; i++){
            try{
                intArray[i] = Integer.parseInt(intStrArray[i].trim());
            }catch (NumberFormatException e){
                System.out.println("Not Valid list of integers!");
                return new int[0];
            }
        }
        return intArray;
 
    }
 
    public static int findMin(int[] arrInt){
 
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arrInt.length; i++){
            if(arrInt[i] < min){
                min = arrInt[i];
            }
        }
        return min;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int n){

        Scanner sc = new Scanner(System.in);
        int[] numArray = new int[n];

        for(int i = 0; i < n; i++){
            // System.out.printf("Enter the element %d: ", i+1);
            numArray[i] = sc.nextInt();
        }

        return numArray;
    }

    public static void printArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Element %d contents %d%n", i, arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){

        int size = arr.length;
        int[] sortedArray = Arrays.copyOf(arr, size);
        int temp;

        for(int i = 0; i < size-1; i++){ // Bubble Sort
            boolean swapped = false;
            for(int j = 0; j < size-i-1; j++){
                if(sortedArray[j] < sortedArray[j+1]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break; //already sorted
        }

        return sortedArray;
    }
}
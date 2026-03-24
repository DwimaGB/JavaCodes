import java.util.Scanner;

public class MinimumElement {
    

    private static int readInteger(){
        
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    private static int[] readElements(int noElements){
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[noElements];
        
        for(int i = 0; i < noElements; i++){
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }
    
    private static int findMin(int[] arr){
        
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
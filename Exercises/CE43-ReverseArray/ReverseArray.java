import java.util.Arrays;

public class ReverseArray {
    
    private static void reverse(int[] arr){
        
        int size = arr.length;
        int temp;
        
        System.out.println("Array = " + Arrays.toString(arr));    
        
        for(int i = 0; i < size/2; i++){
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        
        System.out.println("Reversed array = " + Arrays.toString(arr));    
    }
}
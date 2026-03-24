import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
 
        int[] arr = {1, 2, 3, 4, 5}; //odd elements
        System.out.println("Before reverse: " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("After reverse: " + Arrays.toString(arr));
 
        int[] arr2 = {1, 2, 3, 4, 5, 6}; //even elements
        System.out.println("Before reverse: " + Arrays.toString(arr2));
        reverseArray(arr2);
        System.out.println("After reverse: " + Arrays.toString(arr2));
    }
 
    private static void reverseArray(int[] arr){
 
        int size = arr.length;
        int temp;
 
        for(int i = 0; i < size/2; i++){
            temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
    }
}
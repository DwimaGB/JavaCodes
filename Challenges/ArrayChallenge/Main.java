import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = getRandomArray(10);
        System.out.println(Arrays.toString(arr));
        sortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getRandomArray(int size){

        Random randomInt = new Random();
        int[] newInt = new int[size];

        for(int i = 0; i < size; i++){
            newInt[i] = randomInt.nextInt(1000);
        }

        return newInt;
    }

    public static void sortDescending(int[] arr){

        Arrays.sort(arr); //sort original array
        reverseArray(arr); // reverse the Array to get descending order
    }

    public static void reverseArray(int[] arr){

        int size = arr.length;
        int[] arrayAsc = Arrays.copyOf(arr, size);

        for(int i = 0; i < size ; i++){
            arr[i] = arrayAsc[size - i - 1];
        }
    }

}
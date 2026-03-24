public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int temp = number;
        int lastDigit = number % 10, firstDigit;
 
        while(temp >= 10){
            temp /= 10;
        }
        firstDigit = temp;
 
        return (firstDigit + lastDigit);
    }
}
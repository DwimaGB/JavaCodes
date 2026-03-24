public class DigitSumChallenge {
    public static void main(String[] args){
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        if (number < 10) return -1;

        int sum = 0;
        int digit;
        while(number > 0){
            digit = number%10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

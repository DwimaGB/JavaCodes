public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        } 
        int reversedNumber = reverse(number);
        int digitCountNumber = getDigitCount(number);
        int digitCountReverse = getDigitCount(reversedNumber);
        int numberZerosAtEnd = digitCountNumber - digitCountReverse; // counting the number of zeroes that has ben omitted while reversing


//        System.out.println(digitCountNumber);
//        System.out.println(digitCountReverse);
//        System.out.println(numberZerosAtEnd);

        for(int i=0; i<digitCountReverse; i++){
            int digit = reversedNumber % 10;
            String digitToWord = switch(digit){
                                case 0 -> "Zero";
                                case 1 -> "One";
                                case 2 -> "Two";
                                case 3 -> "Three";
                                case 4 -> "Four";
                                case 5 -> "Five";
                                case 6 -> "Six";
                                case 7 -> "Seven";
                                case 8 -> "Eight";
                                case 9 -> "Nine";
                                default -> "Invalid Value";
            };
            reversedNumber /= 10;
            System.out.print(digitToWord + " ");
        }
        for(int i=0; i<numberZerosAtEnd; i++){ // if zeroes was omitted when reversing
            System.out.print ("Zero ");
        }
    }


    public static int reverse(int number){
        int reversedNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number == 0) return 1;

        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
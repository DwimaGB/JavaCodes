public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

    int temp = Math.abs(number);
    int reversed = 0;

    while (temp > 0) {
        int digit = temp % 10;
        reversed = reversed * 10 + digit;
        temp /= 10;
    }

    return reversed == Math.abs(number);
}

}
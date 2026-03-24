public class WhileLoopChallenge {
    public static void main(String[] args){
        int i=5;
        int evenCount = 0, oddCount = 0;
        while(i<=20){
            if(isEvenNumber(i)){
                evenCount++;
                System.out.print("Even: " + i + " ");
                if(evenCount == 5){
                    break;
                }

            }
            else{
                System.out.print("Odd: " + i + " ");
                oddCount++;
            }
            i++;
        }

        System.out.println("\nTotal even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }

    public static boolean isEvenNumber(int num){
        return (num%2 == 0);
    }
}

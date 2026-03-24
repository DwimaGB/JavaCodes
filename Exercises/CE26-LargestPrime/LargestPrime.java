public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number <= 1) return -1;

        int largestPrime = -1;

        for(int i = 2; i<=number; i++){
            boolean skip = false;
            
            if((number % i == 0)){
                
                for(int j=2; j<i; j++){
                    if(i % j == 0){
                        skip = true;
                        break;
                    }
                    
                }
                if(skip) continue;
                
                largestPrime = i;
                
            }
        }
        return largestPrime;
    }

 
}
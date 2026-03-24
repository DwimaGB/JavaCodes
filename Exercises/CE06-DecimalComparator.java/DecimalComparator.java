public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2){
        int integerPart1, integerPart2;
        
        for(int i=0; i<4; i++){
            integerPart1 = (int) decimal1;
            integerPart2 = (int) decimal2;
            
            if(integerPart1 != integerPart2) return false;
            
            decimal1 *= 10;
            decimal2 *= 10;
        }
        
        return true;
        
    }
}
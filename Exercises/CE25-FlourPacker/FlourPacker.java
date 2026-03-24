public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int remainingGoal = goal;

        while(remainingGoal > 0){
            if(remainingGoal < 5 && smallCount == 0) break; // can't satisfy the goal
            
            if(remainingGoal >= 5 && bigCount > 0){ // if there space left for big bags take it 
                remainingGoal -= 5;
                bigCount--;
            }
            else if(smallCount > 0){
                remainingGoal--;
                smallCount--;
            }
        }
        return (remainingGoal == 0);

    }
}
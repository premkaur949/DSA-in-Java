
import java.util.Arrays;
import java.util.Collections;
public class Exercise {
    public static int[] findTopTwoScores(int[] array) {
        int first=Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        
        for(int score:array){
            if(score>first){
                second=first;
                first=score;
            }else if(score>second && score<first){
                second=score;
            }
            
        }
        return new int[]{first, second};
    }
}

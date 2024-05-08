import java.util.*;
import java.util.math;
public class Ex2 {
 
        public static int sumDiagonalElements(int[][] array) {
          
          int sum=0;
          for(int row=0; row<array.length; row++){
                      sum=sum+array[row][row];
                  }
          return sum;
      }
}

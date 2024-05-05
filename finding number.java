import java.util.*;
public class Search {
    public int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]==valueToSearch) {
                return i;

            }
        }throw new IllegalArgumentException("No such number found");
    }

}

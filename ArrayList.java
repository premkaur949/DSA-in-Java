package ArrayList;
import java.util.*;

public class arrayL {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        System.out.println(numbers);
        //insertion
        numbers.add(2,5);
        System.out.println(numbers);
        //accessing
        System.out.println(numbers.get(0));
        //traversing
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));   
        }
        //searching
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B"));   
        for (String letters : stringList) {
            if(letters.equals("A")){
                System.out.println("The value exists!");
              
            }
            //indexOf
            int index = stringList.indexOf("B");
            System.out.println("The element is found at index of " + index);
            break;
        }      
        
    }
}



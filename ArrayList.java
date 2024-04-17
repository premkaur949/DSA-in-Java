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
    }
}



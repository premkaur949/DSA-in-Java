import java.util.*;
public class AvgTemp {
    
    //how many days: n
    //temp on day 1....n :
    // find avg temp of imput
    //output of days which are greater than avg

public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Number of days: ");
        int days=input.nextInt();
        for(int i=1; i<=days; i++){
            System.out.println("Temperature on Day "+i+":");
            Scanner high= new Scanner(System.in);
            i=high.nextInt();
        }
}

}

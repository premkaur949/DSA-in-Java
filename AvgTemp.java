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
        int[] Temp=new int[days];
        int sum=0;
            for (int i = 0; i < days; i++) {
            Scanner consol = new Scanner(System.in);
            System.out.println("The Temperature of day "+(i+1)+ " is: ");
            Temp[i]= consol.nextInt();
            sum=sum+Temp[i];
        }
        int average= sum/days;
        System.out.println("The average temperature recorded is: "+average);
        for(int i=0; i<Temp.length; i++){
            if(Temp[i]>average){
            System.out.println("The days which have temp higher than average are: "+(i+1));
        }}
}

}

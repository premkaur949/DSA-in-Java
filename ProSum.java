import java.util.ArrayList;
import java.util.Arrays;

public class sumpro {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int d= 0;
        int e=0;
        int f=arr.get(0)+arr.get(1);
        int g=arr.get(0)*arr.get(1);
        if (arr.size()>3) {
            for (int i = 0; i < arr.size()-3; i++) {
                f=f+arr.get(i+3);
                d=d+f;
    
            }
            for (int i = 0; i < arr.size()-1; i++) {
                int a=arr.get(i);
                int b=arr.get(i+1);
                int c= a*b;
                e=e*c;
                
            }
            
        }
    }
}

package OneD;

public class OneDArray {
    int arr[] = null;

    //constructor
    public OneDArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i]= Integer.MIN_VALUE;
        }
    }
    //insertion 
    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location]==Integer.MIN_VALUE)
            arr[location]=valueToBeInserted;
            System.out.println("Successfully inserted");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
    }
    

    //traversing
    public void traverseArray() {
    try{
        for (int i=0; i<arr.length; i++){
            System.out.print("[" +arr[i] + " "+"]" );
        }
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
    }

    //searching
    public void searchInArray(int valueToSearch) {
    try{
        for(int i=0; i<arr.length; i++){
            if( arr[i]==valueToSearch){
            System.out.println("The value is at index "+ i);
            }
        }
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
    }

    //deletion
    public void deleteValue(int valueToDeleteIndex){
    try{   
        for (int i=0;i<arr.length;i++){
            if(arr[i]==valueToDeleteIndex){
            arr[i]=Integer.MIN_VALUE;
            System.out.println("value deleted");
            }
        }
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
    }  
}



class Main{
public static void main(String[] args){
    
    OneDArray oda=new OneDArray(3);
    oda.insert(0,10);
    oda.insert(1,20);
    oda.insert(2,30);
    oda.traverseArray();
    oda.searchInArray(20);
    oda.deleteValue(10);
    oda.deleteValue(40);
    oda.traverseArray();
}
}

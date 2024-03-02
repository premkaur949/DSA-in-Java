package OneD;

public class OneDArray {
    int arr[] = null;

    public OneDArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i]= Integer.MIN_VALUE;
        }
    }
    //insertion 
    public void insert(int location, int valueToBeInserted){
        if(arr[location]==Integer.MIN_VALUE){
            arr[location]=valueToBeInserted;
            System.out.println("Successfully inserted");
        }else{
            System.out.println("Index not empty");
        }
    } 

    //traversing
    public void traverseArray() {

        for (int i=0; i<arr.length; i++){
                System.out.print("[" +arr[i] + " "+"]" );
        }
    }

    public void searchInArray(int valueToSearch) {
        for(int i=0; i<arr.length; i++){
            if( arr[i]==valueToSearch){
            System.out.println("The value is at index "+ i);
            }
        }
    }
    public void deleteValue(int valueToDeleteIndex){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==valueToDeleteIndex){
                arr[i]=Integer.MIN_VALUE;
                System.out.println("value deleted");
            }
        }
    }  
}



// class Main {
//     public static void main(String[] args){

//         OneDArray oda=new OneDArray(3);
//         oda.insert(0,10);
//         oda.insert(1,20);
//         oda.insert(2,30);

        
    //     SingleDimensionArray sda= new SingleDimensionArray(3);
    //     sda.insert(0,10);
    //     sda.insert(1,20);
    //     sda.insert(2,30);
    // }
// }
class Main{
public static void main(String[] args){
       
    // OneDArray oda= new OneDArray(3);
    // oda.insert(0,10);
    OneDArray oda=new OneDArray(3);
    oda.insert(0,10);
    oda.insert(1,20);
    oda.insert(2,30);
    oda.traverseArray();
    // oda.searchInArray(20);
    oda.deleteValue(10);
    oda.deleteValue(40);
    oda.traverseArray();
}
}

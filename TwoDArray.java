public class TwoDArray{
    int arr[][]=null;

    public TwoDArray(int numberOfRows, int numberOfColumns){
        arr= new int[numberOfRows][numberOfColumns];
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr.length; col++){
                arr[row][col]= Integer.MIN_VALUE;
            }
        }
    }

// insertion
    public void valueToBeInserted(int row, int column, int value){
    try{ 
        if (arr[row][column] == Integer.MIN_VALUE){
            arr[row][column] = value;
            System.out.println("The value has been added.");
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid!");
    }
}

// accessing
   public void accessCell(int row, int col){
        try{
            System.out.println("the value at row: "+row+" and column: "+col+" is " +(arr[row][col]));
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid!");
    }
}

// searching
    public void searchingValue(int value){
        try{
            for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]== value){
                System.out.println("The value "+ value+ " is at index"+ arr[i][j]);
            }}}}catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid!");
            }
        }
    //traversing
    public void traversing(){
        try{ 
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }}catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid!");
        }
    }
    //deletion of known value
    public void deleteValuefromArray(int valueToBeDeleted){
        try{
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==valueToBeDeleted){
                    arr[i][j] = Integer.MIN_VALUE;
                    System.out.println("The value has been deleted from index ("+i+","+j+")");
                }
            }
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid!");
    }
}

    public static void main(String[] args){
        TwoDArray tda= new TwoDArray(3, 3);
        tda.valueToBeInserted(1, 1, 1);
        tda.valueToBeInserted(2, 2, 2);
        tda.valueToBeInserted(3, 3, 3);
        tda.valueToBeInserted(0, 0, 0);
        tda.accessCell(1,1);
        tda.searchingValue(2);
        tda.traversing();
        tda.deleteValuefromArray(1);
    }
}

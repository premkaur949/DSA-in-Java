public class permutation {
    public boolean permutation(int[] array1, int[] array2){
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]==array2[j]  ){
                    return true;
                }
            }
        }return false;
    }

}



public class Exercise {
    public int[] twoSum(int[] nums, int target) {
        
        
        for(int a=0; a<nums.length-1; a++){
            for(int b=1; b<nums.length; b++){
                if(target==nums[a]+nums[b]){
                    return new int[] {a,b};
                }

            }
            
        }
        throw new IllegalArgumentException("no such numbers exist");
}
}



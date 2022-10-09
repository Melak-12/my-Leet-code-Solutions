class Solution {
    public int pivotIndex(int[] nums) {
            int leftsum=0;
            int totalsum=0;
            int size=nums.length;
            for(int x :nums){
                    totalsum+=x;
                    
            }
            for(int i=0;i<size;i++){
                   if(leftsum==totalsum-leftsum-nums[i]){
                            return i;
                    }
                     leftsum+=nums[i];
                  
            }
       return -1; 
    }
}

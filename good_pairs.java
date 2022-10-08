class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i<j){//example nums = [1,2,3,1,1,3]
                    if(nums[i]==nums[j]){
                        count++;
                        
                    }
                }
            }
        }
        return count;
    }
}

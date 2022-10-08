
class Solution {
    public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums); 
            int ans=0;
            for(int i=0;i<nums.length;i++){
                    if(k==nums.length-i)
                           ans=nums[i];
            }
        return ans;
    }
}

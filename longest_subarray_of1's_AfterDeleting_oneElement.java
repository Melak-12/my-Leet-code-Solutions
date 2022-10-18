class Solution {
    public int longestSubarray(int[] nums) {
            int size=nums.length;
            int count=0;
            int curcount=0,prevcount=0,maxcount=0;
            for(int i=0;i<size;i++){
                    if(nums[i]==1){
                            curcount++;
                    }
                    else{
                            maxcount=Math.max(maxcount,curcount+prevcount);
                            prevcount=curcount;
                            curcount=0;
                    }
            }
            maxcount=Math.max(maxcount,curcount+prevcount);

                    
        return maxcount==size?maxcount-1:maxcount;
    }
}

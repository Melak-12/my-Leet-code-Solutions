class Solution {
    public void moveZeroes(int[] nums) {
            int size=nums.length;
            int left=0;
            int temp=0;
            for(int i=0;i<size;i++){
                    if(nums[i]!=0){       //1,0,5
                            temp=nums[i];
                            nums[i]=nums[left];
                            nums[left]=temp;
                              left++;
                           
                    }
                   
            }
       
    }
}

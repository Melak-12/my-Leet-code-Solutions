
class Solution {
    public int maxOperations(int[] nums, int k) {
            int count=0;
            int size=nums.length;
            Arrays.sort(nums);
            int i=0,j=nums.length-1;
        while(i<j){
           if(nums[i]+nums[j]==k){
                        count++;
                   i++;
                   j--;
                        
                    }
                else if(nums[i]+nums[j]<k){
                        i++;
                }
                 else if(nums[i]+nums[j]>k){
                     j--;
                }
                }
             return count;
            }
        }
       

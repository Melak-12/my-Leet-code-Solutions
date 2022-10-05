class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[102];
        for(int num:nums){
            arr[num]++;
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        int[] result=new int[nums.length];
        for(int i=0;i<result.length;i++){
            if(nums[i] == 0){
                result[i]=0;
            }
            else{
                result[i]=arr[nums[i]-1];
            }
        }
        return result;
    }
}

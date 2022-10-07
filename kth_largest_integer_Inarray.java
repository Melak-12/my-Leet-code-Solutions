import java.math.BigInteger;   
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
      PriorityQueue<BigInteger> priorq = new PriorityQueue<BigInteger>();
        for(int i=0; i<nums.length;i++){
              priorq .add(new BigInteger(nums[i]));
            if( priorq .size()>k){
                 priorq .remove();
            }
        }
        
        
        return String.valueOf( priorq .peek());
        
    }
}

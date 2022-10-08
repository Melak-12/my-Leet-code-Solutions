class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int s1=nums1.length;
            int s2=nums2.length;
       int[]ans=new int[s1];
        for(int i=0;i<s1;i++){
            boolean check=false;
            for(int j=0;j<s2;j++){
                if(nums1[i]==nums2[j]){
                        check=true;
                }
                if(check && nums1[i]<nums2[j]){
                    ans[i]=nums2[j];
                        check=false;
                        break;
                }
            }
            if(check==true){
                    ans[i]=-1;
            }
            
        }
        return ans;
            
     }
}

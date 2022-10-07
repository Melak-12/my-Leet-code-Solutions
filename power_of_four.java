class Solution {
    public boolean isPowerOfFour(int n) {
    if(n==1) return true;
     boolean ans = false;
 
    while(n>0){
        int a= n%4;
        if(a==0){
            n=n/4;
            if(n==1)
                return true;
        }else{
            return false;
        }
    }
     return ans;
}
    }

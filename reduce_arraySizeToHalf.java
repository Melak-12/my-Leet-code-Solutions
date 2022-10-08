class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
            int max=Integer.MIN_VALUE;
            for(int i:arr){
                    max=Math.max(max,i);
                    
            }
            int freq[]=new int[max+1];
            for(int i:arr){
                    freq[i]++;
            }
            Arrays.sort(freq);
            int i=max;
            int count=0;
            while(n>arr.length/2){
                    n-=freq[i];
                    i--;
                    count++;
            }
      return count;      
    }
}
